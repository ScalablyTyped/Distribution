package typings.opentok

import typings.opentok.mod.ArchiveMode
import typings.opentok.mod.ArchiveStatus
import typings.opentok.mod.BroadcastLayoutType
import typings.opentok.mod.MediaMode
import typings.opentok.mod.OutputMode
import typings.opentok.mod.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentokStrings {
  
  @js.native
  sealed trait `1280x720` extends StObject
  inline def `1280x720`: `1280x720` = "1280x720".asInstanceOf[`1280x720`]
  
  @js.native
  sealed trait `640x480` extends StObject
  inline def `640x480`: `640x480` = "640x480".asInstanceOf[`640x480`]
  
  @js.native
  sealed trait always
    extends StObject
       with ArchiveMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait available
    extends StObject
       with ArchiveStatus
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait bestFit
    extends StObject
       with BroadcastLayoutType
  inline def bestFit: bestFit = "bestFit".asInstanceOf[bestFit]
  
  @js.native
  sealed trait camera extends StObject
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait composed
    extends StObject
       with OutputMode
  inline def composed: composed = "composed".asInstanceOf[composed]
  
  @js.native
  sealed trait custom extends StObject
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait expired
    extends StObject
       with ArchiveStatus
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait failed
    extends StObject
       with ArchiveStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait focus
    extends StObject
       with BroadcastLayoutType
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait horizontalPresentation
    extends StObject
       with BroadcastLayoutType
  inline def horizontalPresentation: horizontalPresentation = "horizontalPresentation".asInstanceOf[horizontalPresentation]
  
  @js.native
  sealed trait individual
    extends StObject
       with OutputMode
  inline def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait manual
    extends StObject
       with ArchiveMode
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait moderator
    extends StObject
       with Role
  inline def moderator: moderator = "moderator".asInstanceOf[moderator]
  
  @js.native
  sealed trait paused
    extends StObject
       with ArchiveStatus
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait pip
    extends StObject
       with BroadcastLayoutType
  inline def pip: pip = "pip".asInstanceOf[pip]
  
  @js.native
  sealed trait publisher
    extends StObject
       with Role
  inline def publisher: publisher = "publisher".asInstanceOf[publisher]
  
  @js.native
  sealed trait relayed
    extends StObject
       with MediaMode
  inline def relayed: relayed = "relayed".asInstanceOf[relayed]
  
  @js.native
  sealed trait routed
    extends StObject
       with MediaMode
  inline def routed: routed = "routed".asInstanceOf[routed]
  
  @js.native
  sealed trait screen extends StObject
  inline def screen: screen = "screen".asInstanceOf[screen]
  
  @js.native
  sealed trait started
    extends StObject
       with ArchiveStatus
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait stopped
    extends StObject
       with ArchiveStatus
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait subscriber
    extends StObject
       with Role
  inline def subscriber: subscriber = "subscriber".asInstanceOf[subscriber]
  
  @js.native
  sealed trait uploaded
    extends StObject
       with ArchiveStatus
  inline def uploaded: uploaded = "uploaded".asInstanceOf[uploaded]
  
  @js.native
  sealed trait verticalPresentation
    extends StObject
       with BroadcastLayoutType
  inline def verticalPresentation: verticalPresentation = "verticalPresentation".asInstanceOf[verticalPresentation]
}
