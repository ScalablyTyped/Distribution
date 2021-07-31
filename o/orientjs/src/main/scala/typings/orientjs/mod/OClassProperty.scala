package typings.orientjs.mod

import typings.orientjs.anon.Fields
import typings.orientjs.anon.Force
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OClassProperty")
@js.native
class OClassProperty () extends StObject {
  
  def alter(name: String): js.Promise[OClass] = js.native
  def alter(name: String, setting: js.Any): js.Promise[OClass] = js.native
  
  var `class`: js.UndefOr[OClass] = js.native
  
  var collate: js.UndefOr[String] = js.native
  
  /**
    * Create a new property.
    *
    * @param  config The property name or configuration.
    * @param   reload      Whether to reload the property, default to true.
    * @promise {Object}              The created property.
    */
  def create(): js.Promise[OClassProperty] = js.native
  def create(config: String): js.Promise[OClassProperty] = js.native
  def create(config: String, reload: Boolean): js.Promise[OClassProperty] = js.native
  def create(config: js.Array[PropertyCreateConfig]): js.Promise[js.Array[OClassProperty]] = js.native
  def create(config: js.Array[PropertyCreateConfig], reload: Boolean): js.Promise[js.Array[OClassProperty]] = js.native
  def create(config: Unit, reload: Boolean): js.Promise[OClassProperty] = js.native
  def create(config: PropertyCreateConfig): js.Promise[OClassProperty] = js.native
  def create(config: PropertyCreateConfig, reload: Boolean): js.Promise[OClassProperty] = js.native
  
  var custom: js.UndefOr[Fields] = js.native
  
  def drop(name: String): js.Promise[OClass] = js.native
  def drop(name: String, config: Force): js.Promise[OClass] = js.native
  
  /**
    * Get the property with the given name.
    *
    * @param   name   The property to get.
    * @promise {Object|null}   The retrieved property.
    */
  def get(name: String): js.Promise[OClassProperty] = js.native
  
  var linkedClass: js.UndefOr[String] = js.native
  
  var linkedType: js.UndefOr[PropertyType] = js.native
  
  def list(): js.Promise[js.Array[OClassProperty]] = js.native
  
  var mandatory: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var notNull: js.UndefOr[Boolean] = js.native
  
  var originalName: js.UndefOr[String] = js.native
  
  var readonly: js.UndefOr[Boolean] = js.native
  
  var regexp: js.UndefOr[RegExp | String] = js.native
  
  def reload(): js.Promise[OClassProperty] = js.native
  
  def rename(oldName: String): js.Promise[OClassProperty] = js.native
  def rename(oldName: String, newName: String): js.Promise[OClassProperty] = js.native
  
  var `type`: js.UndefOr[PropertyType] = js.native
  
  /**
    * Update the given property.
    *
    * @param    property The property settings.
    * @param   reload   Whether to reload the property, default to true.
    * @promise {Object}           The updated property.
    */
  def update(config: PropertyUpdateConfig): js.Promise[OClassProperty] = js.native
  def update(config: PropertyUpdateConfig, reload: Boolean): js.Promise[OClassProperty] = js.native
}
