package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILookups extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, Lookup: ILookup): scala.Unit
  def Clone(): ILookups
  def CloneFrom(Lookups: ILookups): scala.Unit
  def GetLookupByItem(Item: scala.Double): ILookup
  def GetLookupIndexByItem(Item: scala.Double): scala.Double
  def Item(Index: scala.Double): ILookup
  def Remove(Index: scala.Double): scala.Unit
}

