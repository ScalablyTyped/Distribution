package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerbosityLevel extends StObject
@JSImport("pdfjs-dist", "VerbosityLevel")
@js.native
object VerbosityLevel extends StObject {
  
  @js.native
  sealed trait ERRORS
    extends StObject
       with VerbosityLevel
  
  @js.native
  sealed trait INFOS
    extends StObject
       with VerbosityLevel
  
  @js.native
  sealed trait WARNINGS
    extends StObject
       with VerbosityLevel
}
