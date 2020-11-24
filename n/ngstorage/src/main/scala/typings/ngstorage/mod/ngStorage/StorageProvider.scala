package typings.ngstorage.mod.ngStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IServiceProvider * / any */ @js.native
trait StorageProvider extends js.Object {
  
  def get[T](key: String): T | Boolean = js.native
  
  def remove(key: String): Unit = js.native
  
  def set[T](key: String, value: T): T | Boolean = js.native
  
  def setDeserializer(deserializer: js.Function1[/* value */ String, _]): Unit = js.native
  
  def setKeyPrefix(prefix: String): Unit = js.native
  
  def setSerializer(serializer: js.Function1[/* value */ js.Any, String]): Unit = js.native
  
  def supported(): Boolean = js.native
}
object StorageProvider {
  
  @scala.inline
  def apply(
    get: String => js.Any | Boolean,
    remove: String => Unit,
    set: (String, js.Any) => js.Any | Boolean,
    setDeserializer: js.Function1[/* value */ String, _] => Unit,
    setKeyPrefix: String => Unit,
    setSerializer: js.Function1[/* value */ js.Any, String] => Unit,
    supported: () => Boolean
  ): StorageProvider = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), setDeserializer = js.Any.fromFunction1(setDeserializer), setKeyPrefix = js.Any.fromFunction1(setKeyPrefix), setSerializer = js.Any.fromFunction1(setSerializer), supported = js.Any.fromFunction0(supported))
    __obj.asInstanceOf[StorageProvider]
  }
  
  @scala.inline
  implicit class StorageProviderOps[Self <: StorageProvider] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => js.Any | Boolean): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Any) => js.Any | Boolean): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDeserializer(value: js.Function1[/* value */ String, _] => Unit): Self = this.set("setDeserializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetKeyPrefix(value: String => Unit): Self = this.set("setKeyPrefix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSerializer(value: js.Function1[/* value */ js.Any, String] => Unit): Self = this.set("setSerializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupported(value: () => Boolean): Self = this.set("supported", js.Any.fromFunction0(value))
  }
}
