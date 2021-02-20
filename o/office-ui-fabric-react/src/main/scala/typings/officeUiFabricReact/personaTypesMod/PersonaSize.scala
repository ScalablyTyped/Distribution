package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaSize extends StObject
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaSize")
@js.native
object PersonaSize extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaSize with Double] = js.native
  
  /**
    *
    * `extraExtraSmall` size has been deprecated in favor of standardized numeric sizing. Use `size24` instead.
    * @deprecated Use `size24` instead.
    */
  @js.native
  sealed trait extraExtraSmall extends PersonaSize
  /* 1 */ val extraExtraSmall: typings.officeUiFabricReact.personaTypesMod.PersonaSize.extraExtraSmall with Double = js.native
  
  /**
    * `extraLarge` size has been deprecated in favor of standardized numeric sizing. Use `size100` instead.
    * @deprecated Use `size100` instead.
    */
  @js.native
  sealed trait extraLarge extends PersonaSize
  /* 6 */ val extraLarge: typings.officeUiFabricReact.personaTypesMod.PersonaSize.extraLarge with Double = js.native
  
  /**
    * `extraSmall` size has been deprecated in favor of standardized numeric sizing. Use `size32` instead.
    * @deprecated Use `size32` instead.
    */
  @js.native
  sealed trait extraSmall extends PersonaSize
  /* 2 */ val extraSmall: typings.officeUiFabricReact.personaTypesMod.PersonaSize.extraSmall with Double = js.native
  
  /**
    * `large` size has been deprecated in favor of standardized numeric sizing. Use `size72` instead.
    * @deprecated Use `size72` instead.
    */
  @js.native
  sealed trait large extends PersonaSize
  /* 5 */ val large: typings.officeUiFabricReact.personaTypesMod.PersonaSize.large with Double = js.native
  
  /**
    * `regular` size has been deprecated in favor of standardized numeric sizing. Use `size48` instead.
    * @deprecated Use `size48` instead.
    */
  @js.native
  sealed trait regular extends PersonaSize
  /* 4 */ val regular: typings.officeUiFabricReact.personaTypesMod.PersonaSize.regular with Double = js.native
  
  /**
    * No `PersonaCoin` is rendered. Deprecated in favor of `size8` to align with design specifications.
    * @deprecated Use `size8` instead. Will be removed in a future major release.
    */
  @js.native
  sealed trait size10 extends PersonaSize
  /* 9 */ val size10: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size10 with Double = js.native
  
  /**
    * Renders a 100px `PersonaCoin`.
    */
  @js.native
  sealed trait size100 extends PersonaSize
  /* 15 */ val size100: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size100 with Double = js.native
  
  /**
    * Renders a 120px `PersonaCoin`.
    */
  @js.native
  sealed trait size120 extends PersonaSize
  /* 18 */ val size120: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size120 with Double = js.native
  
  /**
    * Renders a 16px `PersonaCoin`. Deprecated due to not being in the design specification.
    * @deprecated Will be removed in a future major release.
    */
  @js.native
  sealed trait size16 extends PersonaSize
  /* 8 */ val size16: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size16 with Double = js.native
  
  /**
    * Renders a 24px `PersonaCoin`.
    */
  @js.native
  sealed trait size24 extends PersonaSize
  /* 10 */ val size24: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size24 with Double = js.native
  
  /**
    * Renders a 28px `PersonaCoin`. Deprecated due to not being in the design specification.
    * @deprecated Will be removed in a future major release.
    */
  @js.native
  sealed trait size28 extends PersonaSize
  /* 7 */ val size28: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size28 with Double = js.native
  
  /**
    * Renders a 32px `PersonaCoin`.
    */
  @js.native
  sealed trait size32 extends PersonaSize
  /* 11 */ val size32: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size32 with Double = js.native
  
  /**
    * Renders a 40px `PersonaCoin`.
    */
  @js.native
  sealed trait size40 extends PersonaSize
  /* 12 */ val size40: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size40 with Double = js.native
  
  /**
    * Renders a 48px `PersonaCoin`.
    */
  @js.native
  sealed trait size48 extends PersonaSize
  /* 13 */ val size48: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size48 with Double = js.native
  
  /**
    * Renders a 56px `PersonaCoin`.
    */
  @js.native
  sealed trait size56 extends PersonaSize
  /* 16 */ val size56: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size56 with Double = js.native
  
  /**
    * Renders a 72px `PersonaCoin`.
    */
  @js.native
  sealed trait size72 extends PersonaSize
  /* 14 */ val size72: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size72 with Double = js.native
  
  /**
    * No `PersonaCoin` is rendered.
    */
  @js.native
  sealed trait size8 extends PersonaSize
  /* 17 */ val size8: typings.officeUiFabricReact.personaTypesMod.PersonaSize.size8 with Double = js.native
  
  /**
    * `small` size has been deprecated in favor of standardized numeric sizing. Use `size40` instead.
    * @deprecated Use `size40` instead.
    */
  @js.native
  sealed trait small extends PersonaSize
  /* 3 */ val small: typings.officeUiFabricReact.personaTypesMod.PersonaSize.small with Double = js.native
  
  /**
    * `tiny` size has been deprecated in favor of standardized numeric sizing. Use `size8` instead.
    * @deprecated Use `size8` instead.
    */
  @js.native
  sealed trait tiny extends PersonaSize
  /* 0 */ val tiny: typings.officeUiFabricReact.personaTypesMod.PersonaSize.tiny with Double = js.native
}
