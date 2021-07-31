package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCodes extends StObject
@JSGlobal("Visio.ErrorCodes")
@js.native
object ErrorCodes extends StObject {
  
  @js.native
  sealed trait accessDenied
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait generalException
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait invalidArgument
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait itemNotFound
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait notImplemented
    extends StObject
       with ErrorCodes
  
  @js.native
  sealed trait unsupportedOperation
    extends StObject
       with ErrorCodes
}
