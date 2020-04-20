package typings.nivoCalendar

import typings.nivoCalendar.mod.CalendarSvgProps
import typings.nivoCore.mod.Dimensions
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoCalendarComponents extends nivoCalendarProps {
  @scala.inline
  def Calendar: ComponentType[CalendarSvgProps with Dimensions] = js.constructorOf[typings.nivoCalendar.mod.Calendar].asInstanceOf[ComponentType[CalendarSvgProps with Dimensions]]
  @scala.inline
  def CalendarCanvas: ComponentType[CalendarSvgProps with Dimensions] = js.constructorOf[typings.nivoCalendar.mod.CalendarCanvas].asInstanceOf[ComponentType[CalendarSvgProps with Dimensions]]
  @scala.inline
  def ResponsiveCalendar: ComponentType[ResponsiveCalendarProps] = js.constructorOf[typings.nivoCalendar.mod.ResponsiveCalendar].asInstanceOf[ComponentType[ResponsiveCalendarProps]]
  @scala.inline
  def ResponsiveCalendarCanvas: ComponentType[ResponsiveCalendarCanvasProps] = js.constructorOf[typings.nivoCalendar.mod.ResponsiveCalendarCanvas].asInstanceOf[ComponentType[ResponsiveCalendarCanvasProps]]
}

