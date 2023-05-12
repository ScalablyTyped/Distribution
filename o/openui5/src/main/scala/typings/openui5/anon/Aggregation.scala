package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregation extends StObject {
  
  /**
    * The name of the aggregation on the target into which the objects shall be forwarded. The multiplicity
    * of the target aggregation must be the same as the one of the source aggregation for which forwarding
    * is defined.
    */
  var aggregation: String
  
  /**
    * Whether any binding should happen on the forwarding target or not. Default if omitted is `false`, which
    * means any bindings happen on the outer ManagedObject. When the binding is forwarded, all binding methods
    * like updateAggregation, getBindingInfo, refreshAggregation etc. are called on the target element of the
    * forwarding instead of being called on this element. The basic aggregation mutator methods (add/remove
    * etc.) are only called on the forwarding target element. Without forwardBinding, they are called on this
    * element, but forwarded to the forwarding target, where they actually modify the aggregation.
    */
  var forwardBinding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the function on instances of this ManagedObject which returns the target instance. This second
    * option to specify the target can be used for lazy instantiation of the target. Note that either idSuffix
    * or getter must be given. Also note that the target instance returned by the getter must remain the same
    * over the entire lifetime of this ManagedObject and the implementation assumes that all instances return
    * the same type of object (at least the target aggregation must always be defined in the same class).
    */
  var getter: js.UndefOr[String] = js.undefined
  
  /**
    * A string which is appended to the ID of this ManagedObject to construct the ID of the target ManagedObject.
    * This is one of the two options to specify the target. This option requires the target instance to be
    * created in the init() method of this ManagedObject and to be always available.
    */
  var idSuffix: js.UndefOr[String] = js.undefined
}
object Aggregation {
  
  inline def apply(aggregation: String): Aggregation = {
    val __obj = js.Dynamic.literal(aggregation = aggregation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aggregation] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setForwardBinding(value: Boolean): Self = StObject.set(x, "forwardBinding", value.asInstanceOf[js.Any])
    
    inline def setForwardBindingUndefined: Self = StObject.set(x, "forwardBinding", js.undefined)
    
    inline def setGetter(value: String): Self = StObject.set(x, "getter", value.asInstanceOf[js.Any])
    
    inline def setGetterUndefined: Self = StObject.set(x, "getter", js.undefined)
    
    inline def setIdSuffix(value: String): Self = StObject.set(x, "idSuffix", value.asInstanceOf[js.Any])
    
    inline def setIdSuffixUndefined: Self = StObject.set(x, "idSuffix", js.undefined)
  }
}
