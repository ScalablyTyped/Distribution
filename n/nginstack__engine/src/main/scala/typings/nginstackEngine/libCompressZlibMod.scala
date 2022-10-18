package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompressZlibMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compress/Zlib", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Zlib
  @JSImport("@nginstack/engine/lib/compress/Zlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/compress/Zlib", "BEST_COMPRESSION")
  @js.native
  val BEST_COMPRESSION: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/Zlib", "BEST_SPEED")
  @js.native
  val BEST_SPEED: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/Zlib", "DEFAULT_COMPRESSION")
  @js.native
  val DEFAULT_COMPRESSION: Double = js.native
  
  @JSImport("@nginstack/engine/lib/compress/Zlib", "NO_COMPRESSION")
  @js.native
  val NO_COMPRESSION: Double = js.native
  
  inline def adler32(content: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adler32")(content.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def adler32(content: String, opt_initialAdler: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("adler32")(content.asInstanceOf[js.Any], opt_initialAdler.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compress(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def compress(content: String, opt_level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(content.asInstanceOf[js.Any], opt_level.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def crc32(content: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(content.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def crc32(content: String, opt_initialCrc: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(content.asInstanceOf[js.Any], opt_initialCrc.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def decompress(content: String, windowsBit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(content.asInstanceOf[js.Any], windowsBit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Zlib extends StObject
}
