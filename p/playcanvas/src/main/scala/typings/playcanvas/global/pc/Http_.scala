package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link Http#get}, {@link Http#post}, {@link Http#put}, {@link Http#del}, and
  * {@link Http#request}.
  *
  * @callback HttpResponseCallback
  * @param {number|string|Error|null} err - The error code, message, or exception in the case where the request fails.
  * @param {*} [response] - The response data if no errors were encountered. (format depends on response type: text, Object, ArrayBuffer, XML).
  */
/**
  * Used to send and receive HTTP requests.
  */
@JSGlobal("pc.Http")
@js.native
open class Http_ ()
  extends typings.playcanvas.mod.Http_
object Http_ {
  
  @JSGlobal("pc.Http")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object ContentType {
    
    @JSGlobal("pc.Http.ContentType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pc.Http.ContentType.AAC")
    @js.native
    def AAC: String = js.native
    inline def AAC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AAC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.BASIS")
    @js.native
    def BASIS: String = js.native
    inline def BASIS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASIS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.BIN")
    @js.native
    def BIN: String = js.native
    inline def BIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.DDS")
    @js.native
    def DDS: String = js.native
    inline def DDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DDS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.FORM_URLENCODED")
    @js.native
    def FORM_URLENCODED: String = js.native
    inline def FORM_URLENCODED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORM_URLENCODED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.GIF")
    @js.native
    def GIF: String = js.native
    inline def GIF_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GIF")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.GLB")
    @js.native
    def GLB: String = js.native
    inline def GLB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.JPEG")
    @js.native
    def JPEG: String = js.native
    inline def JPEG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JPEG")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.JSON")
    @js.native
    def JSON: String = js.native
    inline def JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.MP3")
    @js.native
    def MP3: String = js.native
    inline def MP3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MP3")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.MP4")
    @js.native
    def MP4: String = js.native
    inline def MP4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MP4")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.OGG")
    @js.native
    def OGG: String = js.native
    inline def OGG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OGG")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.OPUS")
    @js.native
    def OPUS: String = js.native
    inline def OPUS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPUS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.PNG")
    @js.native
    def PNG: String = js.native
    inline def PNG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PNG")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.TEXT")
    @js.native
    def TEXT: String = js.native
    inline def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.WAV")
    @js.native
    def WAV: String = js.native
    inline def WAV_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WAV")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ContentType.XML")
    @js.native
    def XML: String = js.native
    inline def XML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XML")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object ResponseType {
    
    @JSGlobal("pc.Http.ResponseType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("pc.Http.ResponseType.ARRAY_BUFFER")
    @js.native
    def ARRAY_BUFFER: String = js.native
    inline def ARRAY_BUFFER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_BUFFER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ResponseType.BLOB")
    @js.native
    def BLOB: String = js.native
    inline def BLOB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLOB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ResponseType.DOCUMENT")
    @js.native
    def DOCUMENT: String = js.native
    inline def DOCUMENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ResponseType.JSON")
    @js.native
    def JSON: String = js.native
    inline def JSON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON")(x.asInstanceOf[js.Any])
    
    @JSGlobal("pc.Http.ResponseType.TEXT")
    @js.native
    def TEXT: String = js.native
    inline def TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSGlobal("pc.Http.binaryExtensions")
  @js.native
  def binaryExtensions: js.Array[String] = js.native
  inline def binaryExtensions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binaryExtensions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("pc.Http.retryDelay")
  @js.native
  def retryDelay: Double = js.native
  inline def retryDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retryDelay")(x.asInstanceOf[js.Any])
}
