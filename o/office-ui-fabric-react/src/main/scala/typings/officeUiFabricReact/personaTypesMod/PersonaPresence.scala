package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonaPresence extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends js.Object {
  @js.native
  sealed trait away extends PersonaPresence
  
  @js.native
  sealed trait blocked extends PersonaPresence
  
  @js.native
  sealed trait busy extends PersonaPresence
  
  @js.native
  sealed trait dnd extends PersonaPresence
  
  @js.native
  sealed trait none extends PersonaPresence
  
  @js.native
  sealed trait offline extends PersonaPresence
  
  @js.native
  sealed trait online extends PersonaPresence
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence with Double] = js.native
  /* 3 */ @js.native
  object away extends TopLevel[away with Double]
  
  /* 5 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  /* 6 */ @js.native
  object busy extends TopLevel[busy with Double]
  
  /* 4 */ @js.native
  object dnd extends TopLevel[dnd with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object offline extends TopLevel[offline with Double]
  
  /* 2 */ @js.native
  object online extends TopLevel[online with Double]
  
}

