package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingEncoderMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Encoder
  @JSImport("@nginstack/engine/lib/encoding/Encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", "ARRAY_BUFFER_FORMAT")
  @js.native
  val ARRAY_BUFFER_FORMAT: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", "ISO_8859_1")
  @js.native
  val ISO_8859_1: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", "STRING_FORMAT")
  @js.native
  val STRING_FORMAT: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", "UTF_8")
  @js.native
  val UTF_8: String = js.native
  
  @JSImport("@nginstack/engine/lib/encoding/Encoder", "WINDOWS_1252")
  @js.native
  val WINDOWS_1252: String = js.native
  
  inline def convert(sourceEncoding: String, targetEncoding: String, source: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(sourceEncoding.asInstanceOf[js.Any], targetEncoding.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def convert(sourceEncoding: String, targetEncoding: String, source: Any, encodeFmt: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(sourceEncoding.asInstanceOf[js.Any], targetEncoding.asInstanceOf[js.Any], source.asInstanceOf[js.Any], encodeFmt.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertFromString(targetEncoding: String, source: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFromString")(targetEncoding.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def convertFromString(targetEncoding: String, source: String, encodeFmt: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFromString")(targetEncoding.asInstanceOf[js.Any], source.asInstanceOf[js.Any], encodeFmt.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertToString(sourceEncoding: String, source: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToString")(sourceEncoding.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def listEncodings(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("listEncodings")().asInstanceOf[js.Array[Any]]
  
  inline def supports(encodingName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(encodingName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Encoder extends StObject
}
