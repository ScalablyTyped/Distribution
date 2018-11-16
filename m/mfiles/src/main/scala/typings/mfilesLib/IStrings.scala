package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStrings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, Item: java.lang.String): scala.Unit
  def Clone(): IStrings
  def CloneFrom(Strings: IStrings): scala.Unit
  def Item(Index: scala.Double): java.lang.String
  def Join(Separator: java.lang.String): java.lang.String
  def Remove(Index: scala.Double): scala.Unit
}

