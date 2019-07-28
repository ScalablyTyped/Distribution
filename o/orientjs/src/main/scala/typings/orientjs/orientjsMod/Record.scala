package typings.orientjs.orientjsMod

import typings.node.Buffer
import typings.orientjs.orientjsStrings.b
import typings.orientjs.orientjsStrings.d
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Record")
@js.native
class Record () extends Object {
  var `@class`: js.UndefOr[String] = js.native
  var `@rid`: js.UndefOr[RID] = js.native
  var `@type`: js.UndefOr[d | b] = js.native
  var `@version`: js.UndefOr[Version] = js.native
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  var rid: js.UndefOr[RID] = js.native
  /**
    * Insert the given record into the database.
    *
    * @param  record  The record to insert.
    * @param  options The command options.
    * @promise {Object}        The inserted record.
    */
  def create(record: BinaryRecord | ODocument | Record): typings.bluebird.bluebirdMod.^[Record] = js.native
  def create(record: BinaryRecord | ODocument | Record, options: js.Any): typings.bluebird.bluebirdMod.^[Record] = js.native
  /**
    * Insert the given record into the database.
    *
    * @param  record  The record to insert.
    * @param  options The command options.
    * @promise {Object}        The inserted record.
    */
  def create(records: js.Array[BinaryRecord | ODocument | Record]): typings.bluebird.bluebirdMod.^[js.Array[Record]] = js.native
  def create(records: js.Array[BinaryRecord | ODocument | Record], options: js.Any): typings.bluebird.bluebirdMod.^[js.Array[Record]] = js.native
  def delete(): typings.bluebird.bluebirdMod.^[Record] = js.native
  def delete(record: RID): typings.bluebird.bluebirdMod.^[Record] = js.native
  def delete(record: RID, options: js.Any): typings.bluebird.bluebirdMod.^[Record] = js.native
  /**
    * Delete the given record.
    *
    * @param   record  The record or record id to delete.
    * @param              options The query options.
    * @promise {Object}                    The deleted record object.
    */
  def delete(record: Record): typings.bluebird.bluebirdMod.^[Record] = js.native
  def delete(record: Record, options: js.Any): typings.bluebird.bluebirdMod.^[Record] = js.native
  /**
    * Read the given record.
    *
    * @param  records  The record to load.
    * @param  options The query options.
    * @promise {Object[]}        The loaded record.
    */
  def get(records: js.Array[RID | Record]): typings.bluebird.bluebirdMod.^[js.Array[Buffer | Record]] = js.native
  def get(records: js.Array[RID | Record], options: js.Any): typings.bluebird.bluebirdMod.^[js.Array[Buffer | Record]] = js.native
  def get(record: RID): typings.bluebird.bluebirdMod.^[Record | Buffer] = js.native
  def get(record: RID, options: js.Any): typings.bluebird.bluebirdMod.^[Record | Buffer] = js.native
  /**
    * Read the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The loaded record.
    */
  def get(record: Record): typings.bluebird.bluebirdMod.^[Record | Buffer] = js.native
  def get(record: Record, options: js.Any): typings.bluebird.bluebirdMod.^[Record | Buffer] = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): Boolean = js.native
  def meta(record: String): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: String, options: js.Any): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(records: js.Array[RID | Record]): typings.bluebird.bluebirdMod.^[js.Array[RecordMeta]] = js.native
  def meta(records: js.Array[RID | Record], options: js.Any): typings.bluebird.bluebirdMod.^[js.Array[RecordMeta]] = js.native
  def meta(record: RID): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: RID, options: js.Any): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(record: Record): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: Record, options: js.Any): typings.bluebird.bluebirdMod.^[RecordMeta] = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  /**
    * Resolve all references within the given collection of records.
    *
    * @param  records  The records to resolve.
    * @return            The records with references replaced.
    */
  def resolveReferences(records: js.Array[Record]): js.Array[Record] = js.native
  /**
    * Update the given record.
    *
    * @param  record  The record to update.
    * @param  options The query options.
    * @promise {Object}        The updated record.
    */
  def update(): typings.bluebird.bluebirdMod.^[Record] = js.native
  def update(record: RID): typings.bluebird.bluebirdMod.^[Record] = js.native
  def update(record: RID, options: js.Any): typings.bluebird.bluebirdMod.^[Record] = js.native
  def update(record: Record): typings.bluebird.bluebirdMod.^[Record] = js.native
  def update(record: Record, options: js.Any): typings.bluebird.bluebirdMod.^[Record] = js.native
}

