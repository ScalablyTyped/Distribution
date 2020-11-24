package typings.postgresInterval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPostgresInterval extends js.Object {
  
  var days: js.UndefOr[Double] = js.native
  
  var hours: js.UndefOr[Double] = js.native
  
  var milliseconds: js.UndefOr[Double] = js.native
  
  var minutes: js.UndefOr[Double] = js.native
  
  var months: js.UndefOr[Double] = js.native
  
  var seconds: js.UndefOr[Double] = js.native
  
  def toISO(): String = js.native
  
  def toISOString(): String = js.native
  
  def toPostgres(): String = js.native
  
  var years: js.UndefOr[Double] = js.native
}
object IPostgresInterval {
  
  @scala.inline
  def apply(toISO: () => String, toISOString: () => String, toPostgres: () => String): IPostgresInterval = {
    val __obj = js.Dynamic.literal(toISO = js.Any.fromFunction0(toISO), toISOString = js.Any.fromFunction0(toISOString), toPostgres = js.Any.fromFunction0(toPostgres))
    __obj.asInstanceOf[IPostgresInterval]
  }
  
  @scala.inline
  implicit class IPostgresIntervalOps[Self <: IPostgresInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToISO(value: () => String): Self = this.set("toISO", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToISOString(value: () => String): Self = this.set("toISOString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToPostgres(value: () => String): Self = this.set("toPostgres", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
}
