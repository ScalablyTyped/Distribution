package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Record")
@js.native
class Record ()
  extends stdLib.Object {
  var `@class`: js.UndefOr[java.lang.String] = js.native
  var `@rid`: js.UndefOr[RID] = js.native
  var `@type`: js.UndefOr[orientjsLib.orientjsLibStrings.d | orientjsLib.orientjsLibStrings.b] = js.native
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
  def create(record: BinaryRecord | ODocument | Record): bluebirdLib.bluebirdMod.^[Record] = js.native
  def create(record: BinaryRecord | ODocument | Record, options: js.Any): bluebirdLib.bluebirdMod.^[Record] = js.native
  /**
    * Insert the given record into the database.
    *
    * @param  record  The record to insert.
    * @param  options The command options.
    * @promise {Object}        The inserted record.
    */
  def create(records: js.Array[BinaryRecord | ODocument | Record]): bluebirdLib.bluebirdMod.^[js.Array[Record]] = js.native
  def create(records: js.Array[BinaryRecord | ODocument | Record], options: js.Any): bluebirdLib.bluebirdMod.^[js.Array[Record]] = js.native
  def delete(): bluebirdLib.bluebirdMod.^[Record] = js.native
  def delete(record: RID): bluebirdLib.bluebirdMod.^[Record] = js.native
  def delete(record: RID, options: js.Any): bluebirdLib.bluebirdMod.^[Record] = js.native
  /**
    * Delete the given record.
    *
    * @param   record  The record or record id to delete.
    * @param              options The query options.
    * @promise {Object}                    The deleted record object.
    */
  def delete(record: Record): bluebirdLib.bluebirdMod.^[Record] = js.native
  def delete(record: Record, options: js.Any): bluebirdLib.bluebirdMod.^[Record] = js.native
  def get(record: RID): bluebirdLib.bluebirdMod.^[Record | nodeLib.Buffer] = js.native
  def get(record: RID, options: js.Any): bluebirdLib.bluebirdMod.^[Record | nodeLib.Buffer] = js.native
  /**
    * Read the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The loaded record.
    */
  def get(record: Record): bluebirdLib.bluebirdMod.^[Record | nodeLib.Buffer] = js.native
  def get(record: Record, options: js.Any): bluebirdLib.bluebirdMod.^[Record | nodeLib.Buffer] = js.native
  /**
    * Read the given record.
    *
    * @param  records  The record to load.
    * @param  options The query options.
    * @promise {Object[]}        The loaded record.
    */
  def get(records: js.Array[RID | Record]): bluebirdLib.bluebirdMod.^[js.Array[Record] | js.Array[nodeLib.Buffer]] = js.native
  def get(records: js.Array[RID | Record], options: js.Any): bluebirdLib.bluebirdMod.^[js.Array[Record] | js.Array[nodeLib.Buffer]] = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: stdLib.PropertyKey): scala.Boolean = js.native
  def meta(record: java.lang.String): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: java.lang.String, options: js.Any): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: RID): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: RID, options: js.Any): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(record: Record): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  def meta(record: Record, options: js.Any): bluebirdLib.bluebirdMod.^[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(records: js.Array[RID | Record]): bluebirdLib.bluebirdMod.^[js.Array[RecordMeta]] = js.native
  def meta(records: js.Array[RID | Record], options: js.Any): bluebirdLib.bluebirdMod.^[js.Array[RecordMeta]] = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: stdLib.PropertyKey): scala.Boolean = js.native
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
  def update(): bluebirdLib.bluebirdMod.^[Record] = js.native
  def update(record: RID): bluebirdLib.bluebirdMod.^[Record] = js.native
  def update(record: RID, options: js.Any): bluebirdLib.bluebirdMod.^[Record] = js.native
  def update(record: Record): bluebirdLib.bluebirdMod.^[Record] = js.native
  def update(record: Record, options: js.Any): bluebirdLib.bluebirdMod.^[Record] = js.native
}

