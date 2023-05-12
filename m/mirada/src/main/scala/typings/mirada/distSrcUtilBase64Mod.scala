package typings.mirada

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilBase64Mod {
  
  @JSImport("mirada/dist/src/util/base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferToBase64(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrayBufferToString(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arrayBufferToUrl(buffer: js.typedarray.ArrayBuffer, mime: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToUrl")(buffer.asInstanceOf[js.Any], mime.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def arrayBufferToUrl(buffer: js.typedarray.ArrayBuffer, mime: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToUrl")(buffer.asInstanceOf[js.Any], mime.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def base64ToUrl(base64: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64ToUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def base64ToUrl(base64: String, mimeType: String, fileName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64ToUrl")(base64.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dataToBase64(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dataToUrl(data: String, mimeType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToUrl")(data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dataToUrl(data: String, mimeType: String, fileName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToUrl")(data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDataUrlFileName(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataUrlFileName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlToBase64(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToBase64")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
