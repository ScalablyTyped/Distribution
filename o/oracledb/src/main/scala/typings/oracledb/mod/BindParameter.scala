package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindParameter extends StObject {
  
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsbinddir
    */
  var dir: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of array elements to be allocated for a PL/SQL Collection INDEX BY associative
    * array OUT or IN OUT array bind variable. For IN binds, the value of maxArraySize is ignored.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#plsqlindexbybinds
    */
  var maxArraySize: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of bytes that an OUT or IN OUT bind variable of type STRING or BUFFER can use to get data.
    *
    * The maximum limit depends on the database type, see below. When binding IN OUT, then maxSize refers to the
    * size of the returned value: the input value can be smaller or bigger. For IN binds, maxSize is ignored.
    *
    * @default 200
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    *
    * With IN or IN OUT binds the type can be explicitly set with type or it will default to the type
    * of the input data value. With OUT binds, the type defaults to oracledb.STRING whenever type is not specified.
    */
  var `type`: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The input value or variable to be used for an IN or IN OUT bind variable.
    */
  var `val`: js.UndefOr[js.Any] = js.undefined
}
object BindParameter {
  
  @scala.inline
  def apply(): BindParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindParameter]
  }
  
  @scala.inline
  implicit class BindParameterMutableBuilder[Self <: BindParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: Double): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setMaxArraySize(value: Double): Self = StObject.set(x, "maxArraySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxArraySizeUndefined: Self = StObject.set(x, "maxArraySize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setType(value: Double | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
