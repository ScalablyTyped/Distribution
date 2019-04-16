package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * 返回一个当前时间的对象。
    */
  def getDate(): stdLib.Date = js.native
  def getDate(value: java.lang.String): stdLib.Date = js.native
  /**
    * 获取时间
    * @param value  时间
    * milliseconds: 从1970年1月1日00:00:00 UTC开始计算的毫秒数
    * datestring: 日期字符串，其格式为："month day, year hours:minutes:seconds"
    */
  def getDate(value: scala.Double): stdLib.Date = js.native
  def getDate(year: scala.Double, month: scala.Double): stdLib.Date = js.native
  def getDate(year: scala.Double, month: scala.Double, date: scala.Double): stdLib.Date = js.native
  def getDate(year: scala.Double, month: scala.Double, date: scala.Double, hours: scala.Double): stdLib.Date = js.native
  def getDate(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double
  ): stdLib.Date = js.native
  def getDate(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): stdLib.Date = js.native
  def getDate(
    year: scala.Double,
    month: scala.Double,
    date: scala.Double,
    hours: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double,
    ms: scala.Double
  ): stdLib.Date = js.native
  /**
    * 生成 regexp 对象需要使用 getRegExp函数。
    * @param pattern : 正则表达式的内容
    * @param flags ：修饰符`g`: global;`i`: ignoreCase; `m`: multiline
    */
  def getRegExp(pattern: java.lang.String): stdLib.RegExp = js.native
  def getRegExp(pattern: java.lang.String, flags: java.lang.String): stdLib.RegExp = js.native
}

