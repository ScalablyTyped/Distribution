package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaPresence extends js.Object
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence with Double] = js.native
  
  @js.native
  sealed trait away extends PersonaPresence
  /* 3 */ @js.native
  object away extends TopLevel[away with Double]
  
  @js.native
  sealed trait blocked extends PersonaPresence
  /* 5 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  @js.native
  sealed trait busy extends PersonaPresence
  /* 6 */ @js.native
  object busy extends TopLevel[busy with Double]
  
  @js.native
  sealed trait dnd extends PersonaPresence
  /* 4 */ @js.native
  object dnd extends TopLevel[dnd with Double]
  
  @js.native
  sealed trait none extends PersonaPresence
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  @js.native
  sealed trait offline extends PersonaPresence
  /* 1 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  @js.native
  sealed trait online extends PersonaPresence
  /* 2 */ @js.native
  object online extends TopLevel[online with Double]
}
