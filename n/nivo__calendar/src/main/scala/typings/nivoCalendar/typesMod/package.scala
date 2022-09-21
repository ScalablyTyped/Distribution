package typings.nivoCalendar.typesMod

import typings.nivoCalendar.anon.ValueString
import typings.nivoCalendar.nivoCalendarStrings.date
import typings.nivoCalendar.nivoCalendarStrings.value
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DateOrString = String | js.Date

type TimeRangeTooltipProps = (Omit[TimeRangeDayData, date | value]) & ValueString
