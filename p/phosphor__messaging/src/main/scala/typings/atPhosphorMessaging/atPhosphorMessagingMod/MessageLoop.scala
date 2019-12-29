package typings.atPhosphorMessaging.atPhosphorMessagingMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/messaging", "MessageLoop")
@js.native
object MessageLoop extends js.Object {
  /**
    * Clear all message data associated with a message handler.
    *
    * @param handler - The message handler of interest.
    *
    * #### Notes
    * This will clear all posted messages and hooks for the handler.
    */
  def clearData(handler: IMessageHandler): Unit = js.native
  /**
    * Process the pending posted messages in the queue immediately.
    *
    * #### Notes
    * This function is useful when posted messages must be processed
    * immediately, instead of on the next animation frame.
    *
    * This function should normally not be needed, but it may be
    * required to work around certain browser idiosyncrasies.
    *
    * Recursing into this function is a no-op.
    */
  def flush(): Unit = js.native
  /**
    * Get the message loop exception handler.
    *
    * @returns The current exception handler.
    *
    * #### Notes
    * The default exception handler is `console.error`.
    */
  def getExceptionHandler(): ExceptionHandler = js.native
  /**
    * Install a message hook for a message handler.
    *
    * @param handler - The message handler of interest.
    *
    * @param hook - The message hook to install.
    *
    * #### Notes
    * A message hook is invoked before a message is delivered to the
    * handler. If the hook returns `false`, no other hooks will be
    * invoked and the message will not be delivered to the handler.
    *
    * The most recently installed message hook is executed first.
    *
    * If the hook is already installed, this is a no-op.
    */
  def installMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = js.native
  /**
    * Post a message to a message handler to process in the future.
    *
    * @param handler - The handler which should process the message.
    *
    * @param msg - The message to post to the handler.
    *
    * #### Notes
    * The message will be conflated with the pending posted messages for
    * the handler, if possible. If the message is not conflated, it will
    * be queued for normal delivery on the next cycle of the event loop.
    *
    * Exceptions in hooks and handlers will be caught and logged.
    */
  def postMessage(handler: IMessageHandler, msg: Message): Unit = js.native
  /**
    * Remove an installed message hook for a message handler.
    *
    * @param handler - The message handler of interest.
    *
    * @param hook - The message hook to remove.
    *
    * #### Notes
    * It is safe to call this function while the hook is executing.
    *
    * If the hook is not installed, this is a no-op.
    */
  def removeMessageHook(handler: IMessageHandler, hook: MessageHook): Unit = js.native
  /**
    * Send a message to a message handler to process immediately.
    *
    * @param handler - The handler which should process the message.
    *
    * @param msg - The message to deliver to the handler.
    *
    * #### Notes
    * The message will first be sent through any installed message hooks
    * for the handler. If the message passes all hooks, it will then be
    * delivered to the `processMessage` method of the handler.
    *
    * The message will not be conflated with pending posted messages.
    *
    * Exceptions in hooks and handlers will be caught and logged.
    */
  def sendMessage(handler: IMessageHandler, msg: Message): Unit = js.native
  /**
    * Set the message loop exception handler.
    *
    * @param handler - The function to use as the exception handler.
    *
    * @returns The old exception handler.
    *
    * #### Notes
    * The exception handler is invoked when a message handler or a
    * message hook throws an exception.
    */
  def setExceptionHandler(handler: ExceptionHandler): ExceptionHandler = js.native
  /**
    * A type alias for the exception handler function.
    */
  type ExceptionHandler = js.Function1[/* err */ Error, Unit]
}

