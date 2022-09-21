package typings.nivoCalendar.typesMod

import typings.nivoCalendar.anon.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScale extends StObject {
  
  def apply(value: Double): String = js.native
  def apply(value: ValueOf): String = js.native
  
  def ticks(): js.Array[Double] = js.native
  def ticks(count: Double): js.Array[Double] = js.native
}
