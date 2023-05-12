package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointType extends StObject
@JSImport("photoshop/dom/Constants", "PointType")
@js.native
object PointType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PointType & String] = js.native
  
  /**
    * 72 points per inch.
    */
  @js.native
  sealed trait POSTSCRIPT
    extends StObject
       with PointType
  /* "POSTSCRIPT" */ val POSTSCRIPT: typings.photoshop.domConstantsMod.PointType.POSTSCRIPT & String = js.native
  
  /**
    * 72.27 points per inch.
    */
  @js.native
  sealed trait TRADITIONAL
    extends StObject
       with PointType
  /* "TRADITIONAL" */ val TRADITIONAL: typings.photoshop.domConstantsMod.PointType.TRADITIONAL & String = js.native
}
