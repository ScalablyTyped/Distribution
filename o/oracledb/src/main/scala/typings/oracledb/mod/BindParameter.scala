package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindParameter extends js.Object {
  
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsbinddir
    */
  var dir: js.UndefOr[Double] = js.native
  
  /**
    * The number of array elements to be allocated for a PL/SQL Collection INDEX BY associative
    * array OUT or IN OUT array bind variable. For IN binds, the value of maxArraySize is ignored.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#plsqlindexbybinds
    */
  var maxArraySize: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of bytes that an OUT or IN OUT bind variable of type STRING or BUFFER can use to get data.
    *
    * The maximum limit depends on the database type, see below. When binding IN OUT, then maxSize refers to the
    * size of the returned value: the input value can be smaller or bigger. For IN binds, maxSize is ignored.
    *
    * @default 200
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    *
    * With IN or IN OUT binds the type can be explicitly set with type or it will default to the type
    * of the input data value. With OUT binds, the type defaults to oracledb.STRING whenever type is not specified.
    */
  var `type`: js.UndefOr[Double | String] = js.native
  
  /**
    * The input value or variable to be used for an IN or IN OUT bind variable.
    */
  var `val`: js.UndefOr[js.Any] = js.native
}
object BindParameter {
  
  @scala.inline
  def apply(): BindParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindParameter]
  }
  
  @scala.inline
  implicit class BindParameterOps[Self <: BindParameter] (val x: Self) extends AnyVal {
    
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
    def setDir(value: Double): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setMaxArraySize(value: Double): Self = this.set("maxArraySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxArraySize: Self = this.set("maxArraySize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setType(value: Double | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVal(value: js.Any): Self = this.set("val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVal: Self = this.set("val", js.undefined)
  }
}
