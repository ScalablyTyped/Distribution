package typings.officeUiFabricReact.personaTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersonaPresence extends StObject
@JSImport("office-ui-fabric-react/lib/components/Persona/Persona.types", "PersonaPresence")
@js.native
object PersonaPresence extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PersonaPresence & Double] = js.native
  
  @js.native
  sealed trait away
    extends StObject
       with PersonaPresence
  /* 3 */ val away: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.away & Double = js.native
  
  @js.native
  sealed trait blocked
    extends StObject
       with PersonaPresence
  /* 5 */ val blocked: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.blocked & Double = js.native
  
  @js.native
  sealed trait busy
    extends StObject
       with PersonaPresence
  /* 6 */ val busy: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.busy & Double = js.native
  
  @js.native
  sealed trait dnd
    extends StObject
       with PersonaPresence
  /* 4 */ val dnd: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.dnd & Double = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with PersonaPresence
  /* 0 */ val none: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.none & Double = js.native
  
  @js.native
  sealed trait offline
    extends StObject
       with PersonaPresence
  /* 1 */ val offline: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.offline & Double = js.native
  
  @js.native
  sealed trait online
    extends StObject
       with PersonaPresence
  /* 2 */ val online: typings.officeUiFabricReact.personaTypesMod.PersonaPresence.online & Double = js.native
}
