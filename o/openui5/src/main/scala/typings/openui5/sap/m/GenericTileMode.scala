package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenericTileMode extends StObject
/**
  * Defines the mode of GenericTile.
  */
@JSGlobal("sap.m.GenericTileMode")
@js.native
object GenericTileMode extends StObject {
  
  @js.native
  sealed trait ContentMode
    extends StObject
       with GenericTileMode
  
  @js.native
  sealed trait HeaderMode
    extends StObject
       with GenericTileMode
}
