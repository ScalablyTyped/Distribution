package typings.pkijs.algorithmIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmIdentifier extends js.Object {
  
  var algorithmId: String = js.native
  
  var algorithmParams: js.Any = js.native
  
  def fromSchema(schema: js.Any): Unit = js.native
  
  /**
    * Check that two "AlgorithmIdentifiers" are equal
    * @param {AlgorithmIdentifier} algorithmIdentifier
    * @returns {boolean}
    */
  def isEqual(algorithmIdentifier: AlgorithmIdentifier): Boolean = js.native
  
  def toJSON(): js.Any = js.native
  
  def toSchema(): js.Any = js.native
}
object AlgorithmIdentifier {
  
  @scala.inline
  def apply(
    algorithmId: String,
    algorithmParams: js.Any,
    fromSchema: js.Any => Unit,
    isEqual: AlgorithmIdentifier => Boolean,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AlgorithmIdentifier = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], algorithmParams = algorithmParams.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), isEqual = js.Any.fromFunction1(isEqual), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[AlgorithmIdentifier]
  }
  
  @scala.inline
  implicit class AlgorithmIdentifierOps[Self <: AlgorithmIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmId(value: String): Self = this.set("algorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmParams(value: js.Any): Self = this.set("algorithmParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEqual(value: AlgorithmIdentifier => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
  }
}
