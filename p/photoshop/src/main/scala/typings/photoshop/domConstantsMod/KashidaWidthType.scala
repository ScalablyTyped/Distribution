package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KashidaWidthType extends StObject
@JSImport("photoshop/dom/Constants", "KashidaWidthType")
@js.native
object KashidaWidthType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KashidaWidthType & String] = js.native
  
  @js.native
  sealed trait LONG
    extends StObject
       with KashidaWidthType
  /* "kashidaWidthLong" */ val LONG: typings.photoshop.domConstantsMod.KashidaWidthType.LONG & String = js.native
  
  @js.native
  sealed trait MEDIUM
    extends StObject
       with KashidaWidthType
  /* "kashidaWidthMedium" */ val MEDIUM: typings.photoshop.domConstantsMod.KashidaWidthType.MEDIUM & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with KashidaWidthType
  /* "kashidaWidthNone" */ val NONE: typings.photoshop.domConstantsMod.KashidaWidthType.NONE & String = js.native
  
  @js.native
  sealed trait SHORT
    extends StObject
       with KashidaWidthType
  /* "kashidaWidthSmall" */ val SHORT: typings.photoshop.domConstantsMod.KashidaWidthType.SHORT & String = js.native
  
  @js.native
  sealed trait STYLISTIC
    extends StObject
       with KashidaWidthType
  /* "kashidaWidthStylistic" */ val STYLISTIC: typings.photoshop.domConstantsMod.KashidaWidthType.STYLISTIC & String = js.native
}
