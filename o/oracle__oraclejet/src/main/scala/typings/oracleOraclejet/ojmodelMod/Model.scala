package typings.oracleOraclejet.ojmodelMod

import typings.oracleOraclejet.anon.Attrs
import typings.oracleOraclejet.anon.Error
import typings.oracleOraclejet.anon.Initialize
import typings.oracleOraclejet.anon.Wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmodel", "Model")
@js.native
class Model () extends js.Object {
  def this(attributes: js.Object) = this()
  def this(attributes: js.UndefOr[scala.Nothing], options: js.Object) = this()
  def this(attributes: js.Object, options: js.Object) = this()
  var attributes: js.Object = js.native
  var customURL: (js.Function3[
    /* param0 */ String, 
    /* param1 */ this.type, 
    /* param2 */ js.Object, 
    String | js.Object | Null
  ]) | Null = js.native
  var defaults: js.Object = js.native
  var id: String | Null = js.native
  var idAttribute: String | Null = js.native
  var omitLanguageHeader: Boolean = js.native
  var urlRoot: String | Null = js.native
  var validate: (js.Function2[/* param0 */ js.Object, /* param1 */ js.Object, String | js.Object | Null]) | Null = js.native
  var validationError: String | js.Object | Null = js.native
  def changedAttributes(): js.Object | Boolean = js.native
  def changedAttributes(attributes: js.Object): js.Object | Boolean = js.native
  def clear(): Model | Boolean = js.native
  def clear(options: js.Object): Model | Boolean = js.native
  def destroy(): Boolean = js.native
  def destroy(options: Wait): Boolean = js.native
  def fetch(): js.Object = js.native
  def fetch(options: Error): js.Object = js.native
  def get(property: String): js.Object = js.native
  def has(property: String): Boolean = js.native
  def hasChanged(): Boolean = js.native
  def hasChanged(attribute: String): Boolean = js.native
  def invert(): js.Object = js.native
  def isNew(): Boolean = js.native
  def isValid(): Boolean = js.native
  def keys(): js.Array[js.Object] = js.native
  def listenTo(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def listenToOnce(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def matches(attrs: js.Object): js.Function1[/* param0 */ this.type, Boolean] = js.native
  def off(): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: String): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: String, callback: js.UndefOr[scala.Nothing], context: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object, callback: js.UndefOr[scala.Nothing], context: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def omit(keys: js.Array[js.Object]): js.Object = js.native
  def omit(keys: js.Object): js.Object = js.native
  def on(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(eventType: js.Object, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def once(eventType: String, callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def pairs(): js.Object = js.native
  def parse(param0: js.Object): js.Object = js.native
  def parseSave(param0: js.Object): js.Object = js.native
  def pick(keys: js.Array[js.Object]): js.Object = js.native
  def pick(keys: js.Object): js.Object = js.native
  def previous(attr: String): js.Object = js.native
  def previousAttributes(): js.Object = js.native
  def save(): js.Object | Boolean = js.native
  def save(attributes: js.UndefOr[scala.Nothing], options: Attrs): js.Object | Boolean = js.native
  def save(attributes: js.Object): js.Object | Boolean = js.native
  def save(attributes: js.Object, options: Attrs): js.Object | Boolean = js.native
  def set(property: String): Model | Boolean = js.native
  def set(property: String, value: js.UndefOr[scala.Nothing], options: js.Object): Model | Boolean = js.native
  def set(property: String, value: js.Object): Model | Boolean = js.native
  def set(property: String, value: js.Object, options: js.Object): Model | Boolean = js.native
  def set(property: js.Object): Model | Boolean = js.native
  def set(property: js.Object, value: js.UndefOr[scala.Nothing], options: js.Object): Model | Boolean = js.native
  def set(property: js.Object, value: js.Object): Model | Boolean = js.native
  def set(property: js.Object, value: js.Object, options: js.Object): Model | Boolean = js.native
  def stopListening(): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.UndefOr[scala.Nothing],
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.UndefOr[scala.Nothing], eventType: String): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.UndefOr[scala.Nothing],
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.Object,
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object, eventType: String): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.Object,
    eventType: String,
    callback: js.Function2[/* eventType */ String, /* data */ js.Object, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def sync(method: String, model: Model): js.Object = js.native
  def sync(method: String, model: Model, options: js.Object): js.Object = js.native
  def toJSON(): js.Object = js.native
  def trigger(eventType: String): js.UndefOr[scala.Nothing] = js.native
  def unset(property: String): Boolean = js.native
  def unset(property: String, options: js.Object): Boolean = js.native
  def url(): String | Null = js.native
  def values(): js.Array[js.Object] = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojmodel", "Model")
@js.native
object Model extends js.Object {
  def extend(): js.Any = js.native
  def extend(properties: js.UndefOr[scala.Nothing], classProperties: js.Object): js.Any = js.native
  def extend(properties: Initialize): js.Any = js.native
  def extend(properties: Initialize, classProperties: js.Object): js.Any = js.native
}

