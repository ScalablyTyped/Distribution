package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaInitialsColor extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaInitialsColor")
@js.native
object PersonaInitialsColor extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaInitialsColor with Double] = js.native
  
  /**
    * Black can result in offensive persona coins with some initials combinations, so it can only be set with overrides.
    * @deprecated will be removed in a future major release.
    */
  @js.native
  sealed trait black extends PersonaInitialsColor
  /* 11 */ @js.native
  object black extends TopLevel[black with Double]
  
  @js.native
  sealed trait blue extends PersonaInitialsColor
  /* 1 */ @js.native
  object blue extends TopLevel[blue with Double]
  
  @js.native
  sealed trait burgundy extends PersonaInitialsColor
  /* 19 */ @js.native
  object burgundy extends TopLevel[burgundy with Double]
  
  @js.native
  sealed trait coolGray extends PersonaInitialsColor
  /* 21 */ @js.native
  object coolGray extends TopLevel[coolGray with Double]
  
  @js.native
  sealed trait cyan extends PersonaInitialsColor
  /* 23 */ @js.native
  object cyan extends TopLevel[cyan with Double]
  
  @js.native
  sealed trait darkBlue extends PersonaInitialsColor
  /* 2 */ @js.native
  object darkBlue extends TopLevel[darkBlue with Double]
  
  @js.native
  sealed trait darkGreen extends PersonaInitialsColor
  /* 6 */ @js.native
  object darkGreen extends TopLevel[darkGreen with Double]
  
  @js.native
  sealed trait darkRed extends PersonaInitialsColor
  /* 14 */ @js.native
  object darkRed extends TopLevel[darkRed with Double]
  
  @js.native
  sealed trait gold extends PersonaInitialsColor
  /* 18 */ @js.native
  object gold extends TopLevel[gold with Double]
  
  /**
    * Gray can result in offensive persona coins with some initials combinations, so it can only be set with overrides.
    */
  @js.native
  sealed trait gray extends PersonaInitialsColor
  /* 22 */ @js.native
  object gray extends TopLevel[gray with Double]
  
  @js.native
  sealed trait green extends PersonaInitialsColor
  /* 5 */ @js.native
  object green extends TopLevel[green with Double]
  
  @js.native
  sealed trait lightBlue extends PersonaInitialsColor
  /* 0 */ @js.native
  object lightBlue extends TopLevel[lightBlue with Double]
  
  @js.native
  sealed trait lightGreen extends PersonaInitialsColor
  /* 4 */ @js.native
  object lightGreen extends TopLevel[lightGreen with Double]
  
  @js.native
  sealed trait lightPink extends PersonaInitialsColor
  /* 7 */ @js.native
  object lightPink extends TopLevel[lightPink with Double]
  
  @js.native
  sealed trait lightRed extends PersonaInitialsColor
  /* 17 */ @js.native
  object lightRed extends TopLevel[lightRed with Double]
  
  @js.native
  sealed trait magenta extends PersonaInitialsColor
  /* 9 */ @js.native
  object magenta extends TopLevel[magenta with Double]
  
  @js.native
  sealed trait orange extends PersonaInitialsColor
  /* 12 */ @js.native
  object orange extends TopLevel[orange with Double]
  
  @js.native
  sealed trait pink extends PersonaInitialsColor
  /* 8 */ @js.native
  object pink extends TopLevel[pink with Double]
  
  @js.native
  sealed trait purple extends PersonaInitialsColor
  /* 10 */ @js.native
  object purple extends TopLevel[purple with Double]
  
  /**
    * Red often has a special meaning, so it is considered a reserved color and can only be set with overrides.
    * @deprecated will be removed in a future major release.
    */
  @js.native
  sealed trait red extends PersonaInitialsColor
  /* 13 */ @js.native
  object red extends TopLevel[red with Double]
  
  @js.native
  sealed trait rust extends PersonaInitialsColor
  /* 24 */ @js.native
  object rust extends TopLevel[rust with Double]
  
  @js.native
  sealed trait teal extends PersonaInitialsColor
  /* 3 */ @js.native
  object teal extends TopLevel[teal with Double]
  
  /**
    * Transparent is not intended to be used with typical initials due to accessibility issues.
    * Its primary use is for overflow buttons, so it is considered a reserved color and can only be set with overrides.
    */
  @js.native
  sealed trait transparent extends PersonaInitialsColor
  /* 15 */ @js.native
  object transparent extends TopLevel[transparent with Double]
  
  @js.native
  sealed trait violet extends PersonaInitialsColor
  /* 16 */ @js.native
  object violet extends TopLevel[violet with Double]
  
  @js.native
  sealed trait warmGray extends PersonaInitialsColor
  /* 20 */ @js.native
  object warmGray extends TopLevel[warmGray with Double]
}
