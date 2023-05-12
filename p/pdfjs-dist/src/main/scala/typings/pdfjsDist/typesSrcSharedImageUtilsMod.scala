package typings.pdfjsDist

import typings.pdfjsDist.anon.Dest
import typings.pdfjsDist.anon.DestPos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcSharedImageUtilsMod {
  
  @JSImport("pdfjs-dist/types/src/shared/image_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertBlackAndWhiteToRGBA(param0: Dest): DestPos = ^.asInstanceOf[js.Dynamic].applyDynamic("convertBlackAndWhiteToRGBA")(param0.asInstanceOf[js.Any]).asInstanceOf[DestPos]
  
  inline def convertToRGBA(params: Any): DestPos | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToRGBA")(params.asInstanceOf[js.Any]).asInstanceOf[DestPos | Null]
  
  inline def grayToRGBA(src: Any, dest: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("grayToRGBA")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
