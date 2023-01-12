package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the object definition of a small scenery item such a tree.
  */
trait SmallSceneryObject
  extends StObject
     with Object {
  
  /**
    * Raw bit flags that describe characteristics of the scenery item.
    */
  val flags: Double
  
  /**
    * The default clearance height of the scenery item.
    */
  val height: Double
  
  /**
    * How much the scenery item costs to build.
    */
  val price: Double
  
  /**
    * How much the scenery item costs to remove.
    */
  val removalPrice: Double
}
object SmallSceneryObject {
  
  inline def apply(
    flags: Double,
    height: Double,
    identifier: String,
    index: Double,
    legacyIdentifier: String,
    name: String,
    price: Double,
    removalPrice: Double,
    `type`: ObjectType
  ): SmallSceneryObject = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], legacyIdentifier = legacyIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], removalPrice = removalPrice.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallSceneryObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmallSceneryObject] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setRemovalPrice(value: Double): Self = StObject.set(x, "removalPrice", value.asInstanceOf[js.Any])
  }
}
