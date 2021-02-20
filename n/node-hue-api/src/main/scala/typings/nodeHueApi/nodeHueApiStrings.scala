package typings.nodeHueApi

import typings.nodeHueApi.mod.BackupStatus
import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import typings.nodeHueApi.mod.LightGroupType
import typings.nodeHueApi.mod.RoomType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHueApiStrings {
  
  @js.native
  sealed trait Bathroom extends RoomType
  @scala.inline
  def Bathroom: Bathroom = "Bathroom".asInstanceOf[Bathroom]
  
  @js.native
  sealed trait Bedroom extends RoomType
  @scala.inline
  def Bedroom: Bedroom = "Bedroom".asInstanceOf[Bedroom]
  
  @js.native
  sealed trait Carport extends RoomType
  @scala.inline
  def Carport: Carport = "Carport".asInstanceOf[Carport]
  
  @js.native
  sealed trait Dining extends RoomType
  @scala.inline
  def Dining: Dining = "Dining".asInstanceOf[Dining]
  
  @js.native
  sealed trait Driveway extends RoomType
  @scala.inline
  def Driveway: Driveway = "Driveway".asInstanceOf[Driveway]
  
  @js.native
  sealed trait `Front door` extends RoomType
  @scala.inline
  def `Front door`: `Front door` = ("Front door").asInstanceOf[`Front door`]
  
  @js.native
  sealed trait `Garage Terrace` extends RoomType
  @scala.inline
  def `Garage Terrace`: `Garage Terrace` = ("Garage Terrace").asInstanceOf[`Garage Terrace`]
  
  @js.native
  sealed trait Garden extends RoomType
  @scala.inline
  def Garden: Garden = "Garden".asInstanceOf[Garden]
  
  @js.native
  sealed trait Gym extends RoomType
  @scala.inline
  def Gym: Gym = "Gym".asInstanceOf[Gym]
  
  @js.native
  sealed trait Hallway extends RoomType
  @scala.inline
  def Hallway: Hallway = "Hallway".asInstanceOf[Hallway]
  
  @js.native
  sealed trait `Kids bedroom` extends RoomType
  @scala.inline
  def `Kids bedroom`: `Kids bedroom` = ("Kids bedroom").asInstanceOf[`Kids bedroom`]
  
  @js.native
  sealed trait Kitchen extends RoomType
  @scala.inline
  def Kitchen: Kitchen = "Kitchen".asInstanceOf[Kitchen]
  
  @js.native
  sealed trait LightGroup extends LightGroupType
  @scala.inline
  def LightGroup: LightGroup = "LightGroup".asInstanceOf[LightGroup]
  
  @js.native
  sealed trait LightSource extends LightGroupType
  @scala.inline
  def LightSource: LightSource = "LightSource".asInstanceOf[LightSource]
  
  @js.native
  sealed trait `Living room` extends RoomType
  @scala.inline
  def `Living room`: `Living room` = ("Living room").asInstanceOf[`Living room`]
  
  @js.native
  sealed trait Luminaire extends LightGroupType
  @scala.inline
  def Luminaire: Luminaire = "Luminaire".asInstanceOf[Luminaire]
  
  @js.native
  sealed trait Nursery extends RoomType
  @scala.inline
  def Nursery: Nursery = "Nursery".asInstanceOf[Nursery]
  
  @js.native
  sealed trait Office extends RoomType
  @scala.inline
  def Office: Office = "Office".asInstanceOf[Office]
  
  @js.native
  sealed trait Other extends RoomType
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait Recreation extends RoomType
  @scala.inline
  def Recreation: Recreation = "Recreation".asInstanceOf[Recreation]
  
  @js.native
  sealed trait Room extends LightGroupType
  @scala.inline
  def Room: Room = "Room".asInstanceOf[Room]
  
  @js.native
  sealed trait Toilet extends RoomType
  @scala.inline
  def Toilet: Toilet = "Toilet".asInstanceOf[Toilet]
  
  @js.native
  sealed trait colorloop extends LightEffect
  @scala.inline
  def colorloop: colorloop = "colorloop".asInstanceOf[colorloop]
  
  @js.native
  sealed trait ct extends ColorMode
  @scala.inline
  def ct: ct = "ct".asInstanceOf[ct]
  
  @js.native
  sealed trait fileready_disabled extends BackupStatus
  @scala.inline
  def fileready_disabled: fileready_disabled = "fileready_disabled".asInstanceOf[fileready_disabled]
  
  @js.native
  sealed trait hs extends ColorMode
  @scala.inline
  def hs: hs = "hs".asInstanceOf[hs]
  
  @js.native
  sealed trait idle extends BackupStatus
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait lselect extends LightAlert
  @scala.inline
  def lselect: lselect = "lselect".asInstanceOf[lselect]
  
  @js.native
  sealed trait none
    extends LightAlert
       with LightEffect
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait prepare_restore extends BackupStatus
  @scala.inline
  def prepare_restore: prepare_restore = "prepare_restore".asInstanceOf[prepare_restore]
  
  @js.native
  sealed trait restoring extends BackupStatus
  @scala.inline
  def restoring: restoring = "restoring".asInstanceOf[restoring]
  
  @js.native
  sealed trait select extends LightAlert
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait startmigration extends BackupStatus
  @scala.inline
  def startmigration: startmigration = "startmigration".asInstanceOf[startmigration]
  
  @js.native
  sealed trait xy extends ColorMode
  @scala.inline
  def xy: xy = "xy".asInstanceOf[xy]
}
