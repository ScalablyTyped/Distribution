package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CMapCompressionType extends StObject
@JSImport("pdfjs-dist", "CMapCompressionType")
@js.native
object CMapCompressionType extends StObject {
  
  @js.native
  sealed trait BINARY extends CMapCompressionType
  
  @js.native
  sealed trait NONE extends CMapCompressionType
  
  @js.native
  sealed trait STREAM extends CMapCompressionType
}
