package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaSize extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaSize")
@js.native
object PersonaSize extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaSize with Double] = js.native
  
  /**
    *
    * `extraExtraSmall` size has been deprecated in favor of standardized numeric sizing. Use `size24` instead.
    * @deprecated Use `size24` instead.
    */
  @js.native
  sealed trait extraExtraSmall extends PersonaSize
  /* 1 */ @js.native
  object extraExtraSmall extends TopLevel[extraExtraSmall with Double]
  
  /**
    * `extraLarge` size has been deprecated in favor of standardized numeric sizing. Use `size100` instead.
    * @deprecated Use `size100` instead.
    */
  @js.native
  sealed trait extraLarge extends PersonaSize
  /* 6 */ @js.native
  object extraLarge extends TopLevel[extraLarge with Double]
  
  /**
    * `extraSmall` size has been deprecated in favor of standardized numeric sizing. Use `size32` instead.
    * @deprecated Use `size32` instead.
    */
  @js.native
  sealed trait extraSmall extends PersonaSize
  /* 2 */ @js.native
  object extraSmall extends TopLevel[extraSmall with Double]
  
  /**
    * `large` size has been deprecated in favor of standardized numeric sizing. Use `size72` instead.
    * @deprecated Use `size72` instead.
    */
  @js.native
  sealed trait large extends PersonaSize
  /* 5 */ @js.native
  object large extends TopLevel[large with Double]
  
  /**
    * `regular` size has been deprecated in favor of standardized numeric sizing. Use `size48` instead.
    * @deprecated Use `size48` instead.
    */
  @js.native
  sealed trait regular extends PersonaSize
  /* 4 */ @js.native
  object regular extends TopLevel[regular with Double]
  
  /**
    * No `PersonaCoin` is rendered. Deprecated in favor of `size8` to align with design specifications.
    * @deprecated Use `size8` instead. Will be removed in a future major release.
    */
  @js.native
  sealed trait size10 extends PersonaSize
  /* 9 */ @js.native
  object size10 extends TopLevel[size10 with Double]
  
  /**
    * Renders a 100px `PersonaCoin`.
    */
  @js.native
  sealed trait size100 extends PersonaSize
  /* 15 */ @js.native
  object size100 extends TopLevel[size100 with Double]
  
  /**
    * Renders a 120px `PersonaCoin`.
    */
  @js.native
  sealed trait size120 extends PersonaSize
  /* 18 */ @js.native
  object size120 extends TopLevel[size120 with Double]
  
  /**
    * Renders a 16px `PersonaCoin`. Deprecated due to not being in the design specification.
    * @deprecated Will be removed in a future major release.
    */
  @js.native
  sealed trait size16 extends PersonaSize
  /* 8 */ @js.native
  object size16 extends TopLevel[size16 with Double]
  
  /**
    * Renders a 24px `PersonaCoin`.
    */
  @js.native
  sealed trait size24 extends PersonaSize
  /* 10 */ @js.native
  object size24 extends TopLevel[size24 with Double]
  
  /**
    * Renders a 28px `PersonaCoin`. Deprecated due to not being in the design specification.
    * @deprecated Will be removed in a future major release.
    */
  @js.native
  sealed trait size28 extends PersonaSize
  /* 7 */ @js.native
  object size28 extends TopLevel[size28 with Double]
  
  /**
    * Renders a 32px `PersonaCoin`.
    */
  @js.native
  sealed trait size32 extends PersonaSize
  /* 11 */ @js.native
  object size32 extends TopLevel[size32 with Double]
  
  /**
    * Renders a 40px `PersonaCoin`.
    */
  @js.native
  sealed trait size40 extends PersonaSize
  /* 12 */ @js.native
  object size40 extends TopLevel[size40 with Double]
  
  /**
    * Renders a 48px `PersonaCoin`.
    */
  @js.native
  sealed trait size48 extends PersonaSize
  /* 13 */ @js.native
  object size48 extends TopLevel[size48 with Double]
  
  /**
    * Renders a 56px `PersonaCoin`.
    */
  @js.native
  sealed trait size56 extends PersonaSize
  /* 16 */ @js.native
  object size56 extends TopLevel[size56 with Double]
  
  /**
    * Renders a 72px `PersonaCoin`.
    */
  @js.native
  sealed trait size72 extends PersonaSize
  /* 14 */ @js.native
  object size72 extends TopLevel[size72 with Double]
  
  /**
    * No `PersonaCoin` is rendered.
    */
  @js.native
  sealed trait size8 extends PersonaSize
  /* 17 */ @js.native
  object size8 extends TopLevel[size8 with Double]
  
  /**
    * `small` size has been deprecated in favor of standardized numeric sizing. Use `size40` instead.
    * @deprecated Use `size40` instead.
    */
  @js.native
  sealed trait small extends PersonaSize
  /* 3 */ @js.native
  object small extends TopLevel[small with Double]
  
  /**
    * `tiny` size has been deprecated in favor of standardized numeric sizing. Use `size8` instead.
    * @deprecated Use `size8` instead.
    */
  @js.native
  sealed trait tiny extends PersonaSize
  /* 0 */ @js.native
  object tiny extends TopLevel[tiny with Double]
}
