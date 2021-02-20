package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaPresence extends StObject
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence with Double] = js.native
  
  @js.native
  sealed trait away extends PersonaPresence
  /* 3 */ val away: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.away with Double = js.native
  
  @js.native
  sealed trait blocked extends PersonaPresence
  /* 5 */ val blocked: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.blocked with Double = js.native
  
  @js.native
  sealed trait busy extends PersonaPresence
  /* 6 */ val busy: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.busy with Double = js.native
  
  @js.native
  sealed trait dnd extends PersonaPresence
  /* 4 */ val dnd: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.dnd with Double = js.native
  
  @js.native
  sealed trait none extends PersonaPresence
  /* 0 */ val none: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.none with Double = js.native
  
  @js.native
  sealed trait offline extends PersonaPresence
  /* 1 */ val offline: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.offline with Double = js.native
  
  @js.native
  sealed trait online extends PersonaPresence
  /* 2 */ val online: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.online with Double = js.native
}
