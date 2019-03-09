package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCanvasElement
  extends HTMLElement
     with CanvasImageSource
     with TexImageSource {
  /**
    * Gets or sets the height of a canvas element on a document.
    */
  var height: scala.Double = js.native
  /**
    * Gets or sets the width of a canvas element on a document.
    */
  var width: scala.Double = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def getContext(contextId: java.lang.String): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  def getContext(contextId: java.lang.String, contextAttributes: js.Object): CanvasRenderingContext2D | WebGLRenderingContext | scala.Null = js.native
  /**
    * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
    * @param contextId The identifier (ID) of the type of canvas to create. Internet Explorer 9 and Internet Explorer 10 support only a 2-D context using canvas.getContext("2d"); IE11 Preview also supports 3-D or WebGL context using canvas.getContext("experimental-webgl");
    */
  @JSName("getContext")
  def getContext_2d(contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.`2d`): CanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def getContext_2d(
    contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.`2d`,
    contextAttributes: CanvasRenderingContext2DSettings
  ): CanvasRenderingContext2D | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.`experimental-webgl`): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def `getContext_experimental-webgl`(
    contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.`experimental-webgl`,
    contextAttributes: WebGLContextAttributes
  ): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.webgl): WebGLRenderingContext | scala.Null = js.native
  @JSName("getContext")
  def getContext_webgl(
    contextId: pdfjsDashDistLib.pdfjsDashDistLibStrings.webgl,
    contextAttributes: WebGLContextAttributes
  ): WebGLRenderingContext | scala.Null = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  def toBlob(callback: BlobCallback): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String): scala.Unit = js.native
  def toBlob(callback: BlobCallback, `type`: java.lang.String, quality: js.Any): scala.Unit = js.native
  /**
    * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
    * @param type The standard MIME type for the image format to return. If you do not specify this parameter, the default value is a PNG format image.
    */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String, quality: js.Any): java.lang.String = js.native
}

@JSGlobal("HTMLCanvasElement")
@js.native
object HTMLCanvasElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLCanvasElement]

