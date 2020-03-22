package typings.nivoCalendar

import typings.nivoCalendar.mod.CalendarSvgProps
import typings.nivoCore.mod.Dimensions
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoCalendarComponents extends nivoCalendarProps {
  @scala.inline
  def Calendar: ComponentType[CalendarSvgProps with Dimensions] = js.constructorOf[typings.nivoCalendar.mod.Calendar].asInstanceOf[typings.react.mod.ComponentType[typings.nivoCalendar.mod.CalendarSvgProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def CalendarCanvas: ComponentType[CalendarSvgProps with Dimensions] = js.constructorOf[typings.nivoCalendar.mod.CalendarCanvas].asInstanceOf[typings.react.mod.ComponentType[typings.nivoCalendar.mod.CalendarSvgProps with typings.nivoCore.mod.Dimensions]]
  @scala.inline
  def ResponsiveCalendar: ComponentType[ResponsiveCalendarProps] = js.constructorOf[typings.nivoCalendar.mod.ResponsiveCalendar].asInstanceOf[typings.react.mod.ComponentType[ResponsiveCalendarProps]]
  @scala.inline
  def ResponsiveCalendarCanvas: ComponentType[ResponsiveCalendarCanvasProps] = js.constructorOf[typings.nivoCalendar.mod.ResponsiveCalendarCanvas].asInstanceOf[typings.react.mod.ComponentType[ResponsiveCalendarCanvasProps]]
}

