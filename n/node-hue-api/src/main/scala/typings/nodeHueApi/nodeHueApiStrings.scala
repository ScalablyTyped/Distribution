package typings.nodeHueApi

import typings.nodeHueApi.mod.BackupStatus
import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import typings.nodeHueApi.mod.LightGroupType
import typings.nodeHueApi.mod.RoomType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHueApiStrings {
  
  @scala.inline
  def Bathroom: Bathroom = "Bathroom".asInstanceOf[Bathroom]
  
  @scala.inline
  def Bedroom: Bedroom = "Bedroom".asInstanceOf[Bedroom]
  
  @scala.inline
  def Carport: Carport = "Carport".asInstanceOf[Carport]
  
  @scala.inline
  def Dining: Dining = "Dining".asInstanceOf[Dining]
  
  @scala.inline
  def Driveway: Driveway = "Driveway".asInstanceOf[Driveway]
  
  @scala.inline
  def `Front door`: `Front door` = ("Front door").asInstanceOf[`Front door`]
  
  @scala.inline
  def `Garage Terrace`: `Garage Terrace` = ("Garage Terrace").asInstanceOf[`Garage Terrace`]
  
  @scala.inline
  def Garden: Garden = "Garden".asInstanceOf[Garden]
  
  @scala.inline
  def Gym: Gym = "Gym".asInstanceOf[Gym]
  
  @scala.inline
  def Hallway: Hallway = "Hallway".asInstanceOf[Hallway]
  
  @scala.inline
  def `Kids bedroom`: `Kids bedroom` = ("Kids bedroom").asInstanceOf[`Kids bedroom`]
  
  @scala.inline
  def Kitchen: Kitchen = "Kitchen".asInstanceOf[Kitchen]
  
  @scala.inline
  def LightGroup: LightGroup = "LightGroup".asInstanceOf[LightGroup]
  
  @scala.inline
  def LightSource: LightSource = "LightSource".asInstanceOf[LightSource]
  
  @scala.inline
  def `Living room`: `Living room` = ("Living room").asInstanceOf[`Living room`]
  
  @scala.inline
  def Luminaire: Luminaire = "Luminaire".asInstanceOf[Luminaire]
  
  @scala.inline
  def Nursery: Nursery = "Nursery".asInstanceOf[Nursery]
  
  @scala.inline
  def Office: Office = "Office".asInstanceOf[Office]
  
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @scala.inline
  def Recreation: Recreation = "Recreation".asInstanceOf[Recreation]
  
  @scala.inline
  def Room: Room = "Room".asInstanceOf[Room]
  
  @scala.inline
  def Toilet: Toilet = "Toilet".asInstanceOf[Toilet]
  
  @scala.inline
  def colorloop: colorloop = "colorloop".asInstanceOf[colorloop]
  
  @scala.inline
  def ct: ct = "ct".asInstanceOf[ct]
  
  @scala.inline
  def fileready_disabled: fileready_disabled = "fileready_disabled".asInstanceOf[fileready_disabled]
  
  @scala.inline
  def hs: hs = "hs".asInstanceOf[hs]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def lselect: lselect = "lselect".asInstanceOf[lselect]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def prepare_restore: prepare_restore = "prepare_restore".asInstanceOf[prepare_restore]
  
  @scala.inline
  def restoring: restoring = "restoring".asInstanceOf[restoring]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def startmigration: startmigration = "startmigration".asInstanceOf[startmigration]
  
  @scala.inline
  def xy: xy = "xy".asInstanceOf[xy]
  
  @js.native
  sealed trait Bathroom extends RoomType
  
  @js.native
  sealed trait Bedroom extends RoomType
  
  @js.native
  sealed trait Carport extends RoomType
  
  @js.native
  sealed trait Dining extends RoomType
  
  @js.native
  sealed trait Driveway extends RoomType
  
  @js.native
  sealed trait `Front door` extends RoomType
  
  @js.native
  sealed trait `Garage Terrace` extends RoomType
  
  @js.native
  sealed trait Garden extends RoomType
  
  @js.native
  sealed trait Gym extends RoomType
  
  @js.native
  sealed trait Hallway extends RoomType
  
  @js.native
  sealed trait `Kids bedroom` extends RoomType
  
  @js.native
  sealed trait Kitchen extends RoomType
  
  @js.native
  sealed trait LightGroup extends LightGroupType
  
  @js.native
  sealed trait LightSource extends LightGroupType
  
  @js.native
  sealed trait `Living room` extends RoomType
  
  @js.native
  sealed trait Luminaire extends LightGroupType
  
  @js.native
  sealed trait Nursery extends RoomType
  
  @js.native
  sealed trait Office extends RoomType
  
  @js.native
  sealed trait Other extends RoomType
  
  @js.native
  sealed trait Recreation extends RoomType
  
  @js.native
  sealed trait Room extends LightGroupType
  
  @js.native
  sealed trait Toilet extends RoomType
  
  @js.native
  sealed trait colorloop extends LightEffect
  
  @js.native
  sealed trait ct extends ColorMode
  
  @js.native
  sealed trait fileready_disabled extends BackupStatus
  
  @js.native
  sealed trait hs extends ColorMode
  
  @js.native
  sealed trait idle extends BackupStatus
  
  @js.native
  sealed trait lselect extends LightAlert
  
  @js.native
  sealed trait none
    extends LightAlert
       with LightEffect
  
  @js.native
  sealed trait prepare_restore extends BackupStatus
  
  @js.native
  sealed trait restoring extends BackupStatus
  
  @js.native
  sealed trait select extends LightAlert
  
  @js.native
  sealed trait startmigration extends BackupStatus
  
  @js.native
  sealed trait xy extends ColorMode
}
