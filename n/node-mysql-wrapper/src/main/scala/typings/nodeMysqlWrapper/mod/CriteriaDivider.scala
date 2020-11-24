package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "CriteriaDivider")
@js.native
class CriteriaDivider[T] protected () extends js.Object {
  def this(table: Table[T]) = this()
  
  var _table: js.Any = js.native
  
  /**
    * Builds the criteria raw object to Criteria object.
    * @param {any} rawCriteriaObject the criteria at raw format you pass eg: {yearsOld:18}.
    * @returnType {Criteria}
    * @return {Criteria}
    */
  def build(rawCriteriaObject: js.Any): CriteriaParts = js.native
}
