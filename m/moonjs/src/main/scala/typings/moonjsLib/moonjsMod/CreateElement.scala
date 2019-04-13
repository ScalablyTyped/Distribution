package typings
package moonjsLib.moonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElement extends js.Object {
  def apply(tag: java.lang.String, attrs: stdLib.Record[java.lang.String, _]): VDomElement = js.native
  def apply(tag: java.lang.String, attrs: stdLib.Record[java.lang.String, _], metadata: js.Any): VDomElement = js.native
  def apply(
    tag: java.lang.String,
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any,
    children: java.lang.String
  ): VDomElement = js.native
  def apply(
    tag: java.lang.String,
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any,
    children: js.Array[VDomElement]
  ): VDomElement = js.native
  def apply(tag: moonjsLib.moonjsLibStrings.`#text`, attrs: stdLib.Record[java.lang.String, _]): VDomElement = js.native
  def apply(
    tag: moonjsLib.moonjsLibStrings.`#text`,
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any
  ): VDomElement = js.native
  def apply(
    tag: moonjsLib.moonjsLibStrings.`#text`,
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any,
    children: java.lang.String
  ): VDomElement = js.native
  def apply(tag: Instance[js.Object], attrs: stdLib.Record[java.lang.String, _]): VDomElement = js.native
  def apply(tag: Instance[js.Object], attrs: stdLib.Record[java.lang.String, _], metadata: js.Any): VDomElement = js.native
  def apply(
    tag: Instance[js.Object],
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any,
    children: java.lang.String
  ): VDomElement = js.native
  def apply(
    tag: Instance[js.Object],
    attrs: stdLib.Record[java.lang.String, _],
    metadata: js.Any,
    children: js.Array[VDomElement]
  ): VDomElement = js.native
}

