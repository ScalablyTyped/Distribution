package typings.opentok

import typings.opentok.mod.ArchiveMode
import typings.opentok.mod.ArchiveStatus
import typings.opentok.mod.MediaMode
import typings.opentok.mod.OutputMode
import typings.opentok.mod.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentokStrings {
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @scala.inline
  def bestFit: bestFit = "bestFit".asInstanceOf[bestFit]
  
  @scala.inline
  def composed: composed = "composed".asInstanceOf[composed]
  
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def horizontalPresentation: horizontalPresentation = "horizontalPresentation".asInstanceOf[horizontalPresentation]
  
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @scala.inline
  def moderator: moderator = "moderator".asInstanceOf[moderator]
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @scala.inline
  def pip: pip = "pip".asInstanceOf[pip]
  
  @scala.inline
  def publisher: publisher = "publisher".asInstanceOf[publisher]
  
  @scala.inline
  def relayed: relayed = "relayed".asInstanceOf[relayed]
  
  @scala.inline
  def routed: routed = "routed".asInstanceOf[routed]
  
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @scala.inline
  def subscriber: subscriber = "subscriber".asInstanceOf[subscriber]
  
  @scala.inline
  def uploaded: uploaded = "uploaded".asInstanceOf[uploaded]
  
  @scala.inline
  def verticalPresentation: verticalPresentation = "verticalPresentation".asInstanceOf[verticalPresentation]
  
  @js.native
  sealed trait always extends ArchiveMode
  
  @js.native
  sealed trait available extends ArchiveStatus
  
  @js.native
  sealed trait bestFit extends js.Object
  
  @js.native
  sealed trait composed extends OutputMode
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait expired extends ArchiveStatus
  
  @js.native
  sealed trait failed extends ArchiveStatus
  
  @js.native
  sealed trait horizontalPresentation extends js.Object
  
  @js.native
  sealed trait individual extends OutputMode
  
  @js.native
  sealed trait manual extends ArchiveMode
  
  @js.native
  sealed trait moderator extends Role
  
  @js.native
  sealed trait paused extends ArchiveStatus
  
  @js.native
  sealed trait pip extends js.Object
  
  @js.native
  sealed trait publisher extends Role
  
  @js.native
  sealed trait relayed extends MediaMode
  
  @js.native
  sealed trait routed extends MediaMode
  
  @js.native
  sealed trait started extends ArchiveStatus
  
  @js.native
  sealed trait stopped extends ArchiveStatus
  
  @js.native
  sealed trait subscriber extends Role
  
  @js.native
  sealed trait uploaded extends ArchiveStatus
  
  @js.native
  sealed trait verticalPresentation extends js.Object
}
