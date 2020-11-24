package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GlobalHotkey
  * The Global Hotkey allows the registration and unregistration of given hotkeys at the OS level, meaning a Window/Application will receive the events regardless of focused state.
  */
@js.native
trait OpenFinGlobalHotkey extends js.Object {
  
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(`type`: OpenFinGlobalHotkeyEventType, listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit]): Unit = js.native
  def addEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Checks if a given hotkey has been registered
    */
  def isRegistered(hotkey: String): Unit = js.native
  def isRegistered(
    hotkey: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def isRegistered(hotkey: String, callback: js.Function1[/* registered */ Boolean, Unit]): Unit = js.native
  def isRegistered(
    hotkey: String,
    callback: js.Function1[/* registered */ Boolean, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Registers a global hotkey with the operating system.
    */
  def register(hotkey: String, listener: js.Function0[Unit]): Unit = js.native
  def register(
    hotkey: String,
    listener: js.Function0[Unit],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def register(hotkey: String, listener: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def register(
    hotkey: String,
    listener: js.Function0[Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(`type`: OpenFinGlobalHotkeyEventType, listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit]): Unit = js.native
  def removeEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinGlobalHotkeyEventType,
    listener: js.Function1[/* event */ GlobalHotkeyEvent, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Unregisters a global hotkey with the operating system.
    */
  def unregister(hotkey: String): Unit = js.native
  def unregister(
    hotkey: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def unregister(hotkey: String, callback: js.Function0[Unit]): Unit = js.native
  def unregister(
    hotkey: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Unregisters all global hotkeys for the current application.
    */
  def unregisterAll(): Unit = js.native
  def unregisterAll(
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  def unregisterAll(callback: js.Function0[Unit]): Unit = js.native
  def unregisterAll(
    callback: js.Function0[Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
}
