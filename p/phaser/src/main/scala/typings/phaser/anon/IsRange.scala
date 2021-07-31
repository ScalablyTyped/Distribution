package typings.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRange extends StObject {
  
  var isRange: Boolean
  
  var number: Double
  
  var operator: String
  
  var parts: js.Array[Double]
  
  var prerelease: String
  
  var range: String
  
  var version: String
}
object IsRange {
  
  @scala.inline
  def apply(
    isRange: Boolean,
    number: Double,
    operator: String,
    parts: js.Array[Double],
    prerelease: String,
    range: String,
    version: String
  ): IsRange = {
    val __obj = js.Dynamic.literal(isRange = isRange.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRange]
  }
  
  @scala.inline
  implicit class IsRangeMutableBuilder[Self <: IsRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: js.Array[Double]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: Double*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    @scala.inline
    def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
