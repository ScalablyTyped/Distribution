package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CharacterAlignment extends StObject
@JSImport("photoshop/dom/Constants", "CharacterAlignment")
@js.native
object CharacterAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CharacterAlignment & String] = js.native
  
  @js.native
  sealed trait EMBOXBOTTOMLEFT
    extends StObject
       with CharacterAlignment
  /* "bottom" */ val EMBOXBOTTOMLEFT: typings.photoshop.domConstantsMod.CharacterAlignment.EMBOXBOTTOMLEFT & String = js.native
  
  @js.native
  sealed trait EMBOXCENTER
    extends StObject
       with CharacterAlignment
  /* "center" */ val EMBOXCENTER: typings.photoshop.domConstantsMod.CharacterAlignment.EMBOXCENTER & String = js.native
  
  @js.native
  sealed trait EMBOXTOPRIGHT
    extends StObject
       with CharacterAlignment
  /* "top" */ val EMBOXTOPRIGHT: typings.photoshop.domConstantsMod.CharacterAlignment.EMBOXTOPRIGHT & String = js.native
  
  @js.native
  sealed trait ICFBOTTOMLEFT
    extends StObject
       with CharacterAlignment
  /* "icfbottom" */ val ICFBOTTOMLEFT: typings.photoshop.domConstantsMod.CharacterAlignment.ICFBOTTOMLEFT & String = js.native
  
  @js.native
  sealed trait ICFBOXTOPRIGHT
    extends StObject
       with CharacterAlignment
  /* "icftop" */ val ICFBOXTOPRIGHT: typings.photoshop.domConstantsMod.CharacterAlignment.ICFBOXTOPRIGHT & String = js.native
  
  @js.native
  sealed trait ROMAN
    extends StObject
       with CharacterAlignment
  /* "roman" */ val ROMAN: typings.photoshop.domConstantsMod.CharacterAlignment.ROMAN & String = js.native
}
