package typings.osrm

import typings.osrm.mod.GeometriesTypes
import typings.osrm.mod.Indication
import typings.osrm.mod.OverviewTypes
import typings.osrm.mod.StepManeuverTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osrmStrings {
  
  @js.native
  sealed trait LineString extends StObject
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait arrive
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def arrive: arrive = "arrive".asInstanceOf[arrive]
  
  @js.native
  sealed trait continue
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait depart
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def depart: depart = "depart".asInstanceOf[depart]
  
  @js.native
  sealed trait distance extends StObject
  @scala.inline
  def distance: distance = "distance".asInstanceOf[distance]
  
  @js.native
  sealed trait duration extends StObject
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait `end of road`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `end of road`: `end of road` = ("end of road").asInstanceOf[`end of road`]
  
  @js.native
  sealed trait `exit rotary`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `exit rotary`: `exit rotary` = ("exit rotary").asInstanceOf[`exit rotary`]
  
  @js.native
  sealed trait `exit roundabout`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `exit roundabout`: `exit roundabout` = ("exit roundabout").asInstanceOf[`exit roundabout`]
  
  @js.native
  sealed trait `false`
    extends StObject
       with OverviewTypes
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait fork
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def fork: fork = "fork".asInstanceOf[fork]
  
  @js.native
  sealed trait full
    extends StObject
       with OverviewTypes
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait geojson
    extends StObject
       with GeometriesTypes
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait left
    extends StObject
       with Indication
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait merge
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  
  @js.native
  sealed trait `new name`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `new name`: `new name` = ("new name").asInstanceOf[`new name`]
  
  @js.native
  sealed trait notification
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait `off ramp`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `off ramp`: `off ramp` = ("off ramp").asInstanceOf[`off ramp`]
  
  @js.native
  sealed trait `on ramp`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `on ramp`: `on ramp` = ("on ramp").asInstanceOf[`on ramp`]
  
  @js.native
  sealed trait polyline
    extends StObject
       with GeometriesTypes
  @scala.inline
  def polyline: polyline = "polyline".asInstanceOf[polyline]
  
  @js.native
  sealed trait polyline6
    extends StObject
       with GeometriesTypes
  @scala.inline
  def polyline6: polyline6 = "polyline6".asInstanceOf[polyline6]
  
  @js.native
  sealed trait ramp
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def ramp: ramp = "ramp".asInstanceOf[ramp]
  
  @js.native
  sealed trait right
    extends StObject
       with Indication
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait rotary
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def rotary: rotary = "rotary".asInstanceOf[rotary]
  
  @js.native
  sealed trait roundabout
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def roundabout: roundabout = "roundabout".asInstanceOf[roundabout]
  
  @js.native
  sealed trait `roundabout turn`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `roundabout turn`: `roundabout turn` = ("roundabout turn").asInstanceOf[`roundabout turn`]
  
  @js.native
  sealed trait `sharp left`
    extends StObject
       with Indication
  @scala.inline
  def `sharp left`: `sharp left` = ("sharp left").asInstanceOf[`sharp left`]
  
  @js.native
  sealed trait `sharp right`
    extends StObject
       with Indication
  @scala.inline
  def `sharp right`: `sharp right` = ("sharp right").asInstanceOf[`sharp right`]
  
  @js.native
  sealed trait simplified
    extends StObject
       with OverviewTypes
  @scala.inline
  def simplified: simplified = "simplified".asInstanceOf[simplified]
  
  @js.native
  sealed trait `slight left`
    extends StObject
       with Indication
  @scala.inline
  def `slight left`: `slight left` = ("slight left").asInstanceOf[`slight left`]
  
  @js.native
  sealed trait `slight rigth`
    extends StObject
       with Indication
  @scala.inline
  def `slight rigth`: `slight rigth` = ("slight rigth").asInstanceOf[`slight rigth`]
  
  @js.native
  sealed trait straight
    extends StObject
       with Indication
  @scala.inline
  def straight: straight = "straight".asInstanceOf[straight]
  
  @js.native
  sealed trait turn
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def turn: turn = "turn".asInstanceOf[turn]
  
  @js.native
  sealed trait `use lane`
    extends StObject
       with StepManeuverTypes
  @scala.inline
  def `use lane`: `use lane` = ("use lane").asInstanceOf[`use lane`]
  
  @js.native
  sealed trait uturn
    extends StObject
       with Indication
  @scala.inline
  def uturn: uturn = "uturn".asInstanceOf[uturn]
}
