package typings.nodeHueApi

import typings.nodeHueApi.mod.BackupStatus
import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import typings.nodeHueApi.mod.LightGroupType
import typings.nodeHueApi.mod.RoomType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeHueApiStrings {
  
  @js.native
  sealed trait Bathroom
    extends StObject
       with RoomType
  @scala.inline
  def Bathroom: Bathroom = "Bathroom".asInstanceOf[Bathroom]
  
  @js.native
  sealed trait Bedroom
    extends StObject
       with RoomType
  @scala.inline
  def Bedroom: Bedroom = "Bedroom".asInstanceOf[Bedroom]
  
  @js.native
  sealed trait Carport
    extends StObject
       with RoomType
  @scala.inline
  def Carport: Carport = "Carport".asInstanceOf[Carport]
  
  @js.native
  sealed trait Dining
    extends StObject
       with RoomType
  @scala.inline
  def Dining: Dining = "Dining".asInstanceOf[Dining]
  
  @js.native
  sealed trait Driveway
    extends StObject
       with RoomType
  @scala.inline
  def Driveway: Driveway = "Driveway".asInstanceOf[Driveway]
  
  @js.native
  sealed trait `Front door`
    extends StObject
       with RoomType
  @scala.inline
  def `Front door`: `Front door` = ("Front door").asInstanceOf[`Front door`]
  
  @js.native
  sealed trait `Garage Terrace`
    extends StObject
       with RoomType
  @scala.inline
  def `Garage Terrace`: `Garage Terrace` = ("Garage Terrace").asInstanceOf[`Garage Terrace`]
  
  @js.native
  sealed trait Garden
    extends StObject
       with RoomType
  @scala.inline
  def Garden: Garden = "Garden".asInstanceOf[Garden]
  
  @js.native
  sealed trait Gym
    extends StObject
       with RoomType
  @scala.inline
  def Gym: Gym = "Gym".asInstanceOf[Gym]
  
  @js.native
  sealed trait Hallway
    extends StObject
       with RoomType
  @scala.inline
  def Hallway: Hallway = "Hallway".asInstanceOf[Hallway]
  
  @js.native
  sealed trait `Kids bedroom`
    extends StObject
       with RoomType
  @scala.inline
  def `Kids bedroom`: `Kids bedroom` = ("Kids bedroom").asInstanceOf[`Kids bedroom`]
  
  @js.native
  sealed trait Kitchen
    extends StObject
       with RoomType
  @scala.inline
  def Kitchen: Kitchen = "Kitchen".asInstanceOf[Kitchen]
  
  @js.native
  sealed trait LightGroup
    extends StObject
       with LightGroupType
  @scala.inline
  def LightGroup: LightGroup = "LightGroup".asInstanceOf[LightGroup]
  
  @js.native
  sealed trait LightSource
    extends StObject
       with LightGroupType
  @scala.inline
  def LightSource: LightSource = "LightSource".asInstanceOf[LightSource]
  
  @js.native
  sealed trait `Living room`
    extends StObject
       with RoomType
  @scala.inline
  def `Living room`: `Living room` = ("Living room").asInstanceOf[`Living room`]
  
  @js.native
  sealed trait Luminaire
    extends StObject
       with LightGroupType
  @scala.inline
  def Luminaire: Luminaire = "Luminaire".asInstanceOf[Luminaire]
  
  @js.native
  sealed trait Nursery
    extends StObject
       with RoomType
  @scala.inline
  def Nursery: Nursery = "Nursery".asInstanceOf[Nursery]
  
  @js.native
  sealed trait Office
    extends StObject
       with RoomType
  @scala.inline
  def Office: Office = "Office".asInstanceOf[Office]
  
  @js.native
  sealed trait Other
    extends StObject
       with RoomType
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait Recreation
    extends StObject
       with RoomType
  @scala.inline
  def Recreation: Recreation = "Recreation".asInstanceOf[Recreation]
  
  @js.native
  sealed trait Room
    extends StObject
       with LightGroupType
  @scala.inline
  def Room: Room = "Room".asInstanceOf[Room]
  
  @js.native
  sealed trait Toilet
    extends StObject
       with RoomType
  @scala.inline
  def Toilet: Toilet = "Toilet".asInstanceOf[Toilet]
  
  @js.native
  sealed trait colorloop
    extends StObject
       with LightEffect
  @scala.inline
  def colorloop: colorloop = "colorloop".asInstanceOf[colorloop]
  
  @js.native
  sealed trait ct
    extends StObject
       with ColorMode
  @scala.inline
  def ct: ct = "ct".asInstanceOf[ct]
  
  @js.native
  sealed trait fileready_disabled
    extends StObject
       with BackupStatus
  @scala.inline
  def fileready_disabled: fileready_disabled = "fileready_disabled".asInstanceOf[fileready_disabled]
  
  @js.native
  sealed trait hs
    extends StObject
       with ColorMode
  @scala.inline
  def hs: hs = "hs".asInstanceOf[hs]
  
  @js.native
  sealed trait idle
    extends StObject
       with BackupStatus
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait lselect
    extends StObject
       with LightAlert
  @scala.inline
  def lselect: lselect = "lselect".asInstanceOf[lselect]
  
  @js.native
  sealed trait none
    extends StObject
       with LightAlert
       with LightEffect
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait prepare_restore
    extends StObject
       with BackupStatus
  @scala.inline
  def prepare_restore: prepare_restore = "prepare_restore".asInstanceOf[prepare_restore]
  
  @js.native
  sealed trait restoring
    extends StObject
       with BackupStatus
  @scala.inline
  def restoring: restoring = "restoring".asInstanceOf[restoring]
  
  @js.native
  sealed trait select
    extends StObject
       with LightAlert
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait startmigration
    extends StObject
       with BackupStatus
  @scala.inline
  def startmigration: startmigration = "startmigration".asInstanceOf[startmigration]
  
  @js.native
  sealed trait xy
    extends StObject
       with ColorMode
  @scala.inline
  def xy: xy = "xy".asInstanceOf[xy]
}
