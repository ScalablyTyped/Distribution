package typings
package osrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object osrmLibStrings {
  @js.native
  sealed trait LineString extends js.Object
  
  @js.native
  sealed trait arrive
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait continue
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait depart
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `end of road`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `exit rotary`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `exit roundabout`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `false`
    extends osrmLib.osrmMod.OSRMNs.OverviewTypes
  
  @js.native
  sealed trait fork
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait full
    extends osrmLib.osrmMod.OSRMNs.OverviewTypes
  
  @js.native
  sealed trait geojson
    extends osrmLib.osrmMod.OSRMNs.GeometriesTypes
  
  @js.native
  sealed trait left
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait merge
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `new name`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait notification
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `off ramp`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `on ramp`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait polyline
    extends osrmLib.osrmMod.OSRMNs.GeometriesTypes
  
  @js.native
  sealed trait polyline6
    extends osrmLib.osrmMod.OSRMNs.GeometriesTypes
  
  @js.native
  sealed trait ramp
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait right
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait rotary
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait roundabout
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `roundabout turn`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `sharp left`
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait `sharp right`
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait simplified
    extends osrmLib.osrmMod.OSRMNs.OverviewTypes
  
  @js.native
  sealed trait `slight left`
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait `slight rigth`
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait straight
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @js.native
  sealed trait turn
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait `use lane`
    extends osrmLib.osrmMod.OSRMNs.StepManeuverTypes
  
  @js.native
  sealed trait uturn
    extends osrmLib.osrmMod.OSRMNs.Indication
  
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  @scala.inline
  def arrive: arrive = "arrive".asInstanceOf[arrive]
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  @scala.inline
  def depart: depart = "depart".asInstanceOf[depart]
  @scala.inline
  def `end of road`: `end of road` = "end of road".asInstanceOf[`end of road`]
  @scala.inline
  def `exit rotary`: `exit rotary` = "exit rotary".asInstanceOf[`exit rotary`]
  @scala.inline
  def `exit roundabout`: `exit roundabout` = "exit roundabout".asInstanceOf[`exit roundabout`]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def fork: fork = "fork".asInstanceOf[fork]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  @scala.inline
  def `new name`: `new name` = "new name".asInstanceOf[`new name`]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def `off ramp`: `off ramp` = "off ramp".asInstanceOf[`off ramp`]
  @scala.inline
  def `on ramp`: `on ramp` = "on ramp".asInstanceOf[`on ramp`]
  @scala.inline
  def polyline: polyline = "polyline".asInstanceOf[polyline]
  @scala.inline
  def polyline6: polyline6 = "polyline6".asInstanceOf[polyline6]
  @scala.inline
  def ramp: ramp = "ramp".asInstanceOf[ramp]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rotary: rotary = "rotary".asInstanceOf[rotary]
  @scala.inline
  def roundabout: roundabout = "roundabout".asInstanceOf[roundabout]
  @scala.inline
  def `roundabout turn`: `roundabout turn` = "roundabout turn".asInstanceOf[`roundabout turn`]
  @scala.inline
  def `sharp left`: `sharp left` = "sharp left".asInstanceOf[`sharp left`]
  @scala.inline
  def `sharp right`: `sharp right` = "sharp right".asInstanceOf[`sharp right`]
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  @scala.inline
  def `slight left`: `slight left` = "slight left".asInstanceOf[`slight left`]
  @scala.inline
  def `slight rigth`: `slight rigth` = "slight rigth".asInstanceOf[`slight rigth`]
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  @scala.inline
  def `use lane`: `use lane` = "use lane".asInstanceOf[`use lane`]
  @scala.inline
  def uturn: uturn = "uturn".asInstanceOf[uturn]
}

