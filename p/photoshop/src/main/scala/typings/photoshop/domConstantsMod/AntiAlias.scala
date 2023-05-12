package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AntiAlias extends StObject
@JSImport("photoshop/dom/Constants", "AntiAlias")
@js.native
object AntiAlias extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AntiAlias & String] = js.native
  
  @js.native
  sealed trait CRISP
    extends StObject
       with AntiAlias
  /* "antiAliasCrisp" */ val CRISP: typings.photoshop.domConstantsMod.AntiAlias.CRISP & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with AntiAlias
  /* "antiAliasNone" */ val NONE: typings.photoshop.domConstantsMod.AntiAlias.NONE & String = js.native
  
  @js.native
  sealed trait SHARP
    extends StObject
       with AntiAlias
  /* "antiAliasSharp" */ val SHARP: typings.photoshop.domConstantsMod.AntiAlias.SHARP & String = js.native
  
  @js.native
  sealed trait SMOOTH
    extends StObject
       with AntiAlias
  /* "antiAliasSmooth" */ val SMOOTH: typings.photoshop.domConstantsMod.AntiAlias.SMOOTH & String = js.native
  
  @js.native
  sealed trait STRONG
    extends StObject
       with AntiAlias
  /* "antiAliasStrong" */ val STRONG: typings.photoshop.domConstantsMod.AntiAlias.STRONG & String = js.native
}
