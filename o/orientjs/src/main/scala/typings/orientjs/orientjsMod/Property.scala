package typings.orientjs.orientjsMod

import typings.orientjs.Anon_Fields
import typings.orientjs.Anon_Force
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Property")
@js.native
class Property () extends js.Object {
  var `class`: js.UndefOr[Class] = js.native
  var collate: js.UndefOr[String] = js.native
  var custom: js.UndefOr[Anon_Fields] = js.native
  var linkedClass: js.UndefOr[String] = js.native
  var linkedType: js.UndefOr[PropertyType] = js.native
  var mandatory: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var notNull: js.UndefOr[Boolean] = js.native
  var originalName: js.UndefOr[String] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var regexp: js.UndefOr[RegExp | String] = js.native
  var `type`: js.UndefOr[PropertyType] = js.native
  def alter(name: String): typings.bluebird.bluebirdMod.^[Class] = js.native
  def alter(name: String, setting: js.Any): typings.bluebird.bluebirdMod.^[Class] = js.native
  def configure(): Unit = js.native
  def configure(config: js.Any): Unit = js.native
  /**
    * Create a new property.
    *
    * @param  config The property name or configuration.
    * @param   reload      Whether to reload the property, default to true.
    * @promise {Object}              The created property.
    */
  def create(): typings.bluebird.bluebirdMod.^[Property] = js.native
  def create(config: String): typings.bluebird.bluebirdMod.^[Property] = js.native
  def create(config: String, reload: Boolean): typings.bluebird.bluebirdMod.^[Property] = js.native
  def create(config: js.Array[PropertyCreateConfig]): typings.bluebird.bluebirdMod.^[js.Array[Property]] = js.native
  def create(config: js.Array[PropertyCreateConfig], reload: Boolean): typings.bluebird.bluebirdMod.^[js.Array[Property]] = js.native
  def create(config: PropertyCreateConfig): typings.bluebird.bluebirdMod.^[Property] = js.native
  def create(config: PropertyCreateConfig, reload: Boolean): typings.bluebird.bluebirdMod.^[Property] = js.native
  def drop(name: String): typings.bluebird.bluebirdMod.^[Class] = js.native
  def drop(name: String, config: Anon_Force): typings.bluebird.bluebirdMod.^[Class] = js.native
  /**
    * Get the property with the given name.
    *
    * @param   name   The property to get.
    * @promise {Object|null}   The retrieved property.
    */
  def get(name: String): typings.bluebird.bluebirdMod.^[Property] = js.native
  def list(): typings.bluebird.bluebirdMod.^[js.Array[Property]] = js.native
  def reload(): typings.bluebird.bluebirdMod.^[Property] = js.native
  def rename(oldName: String): typings.bluebird.bluebirdMod.^[Property] = js.native
  def rename(oldName: String, newName: String): typings.bluebird.bluebirdMod.^[Property] = js.native
  /**
    * Update the given property.
    *
    * @param    property The property settings.
    * @param   reload   Whether to reload the property, default to true.
    * @promise {Object}           The updated property.
    */
  def update(config: PropertyUpdateConfig): typings.bluebird.bluebirdMod.^[Property] = js.native
  def update(config: PropertyUpdateConfig, reload: Boolean): typings.bluebird.bluebirdMod.^[Property] = js.native
}

