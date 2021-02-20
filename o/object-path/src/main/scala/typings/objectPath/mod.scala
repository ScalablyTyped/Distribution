package typings.objectPath

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined object-path.object-path.ObjectPathStatic & {  withInheritedProps :object-path.object-path.ObjectPathStatic, create (options : object-path.object-path.Options | undefined): object-path.object-path.ObjectPathStatic} */
object mod {
  
  /**
    * Binds an object
    */
  @JSImport("object-path", JSImport.Namespace)
  @js.native
  def apply[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
  
  @JSImport("object-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce[TResult](`object`: js.Object, paths: js.Array[Path]): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce[TResult](`object`: js.Object, paths: Path): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): TResult = js.native
  /**
    * Get the first non undefined property
    */
  @JSImport("object-path", "coalesce")
  @js.native
  def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): TResult = js.native
  
  @JSImport("object-path", "create")
  @js.native
  def create(): ObjectPathStatic = js.native
  @JSImport("object-path", "create")
  @js.native
  def create(options: Options): ObjectPathStatic = js.native
  
  /**
    * Deletes a member from object or array
    */
  @JSImport("object-path", "del")
  @js.native
  def del(`object`: js.Object, path: Path): StringDictionary[js.Any] = js.native
  
  /**
    * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
    * are set to empty, numbers to 0, everything else is set to null
    */
  @JSImport("object-path", "empty")
  @js.native
  def empty(`object`: js.Object, path: Path): js.Any = js.native
  
  @JSImport("object-path", "ensureExists")
  @js.native
  def ensureExists[TResult](`object`: js.Object, path: Path): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "ensureExists")
  @js.native
  def ensureExists[TResult](`object`: js.Object, path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  /**
    * Set a value if it doesn't exist, do nothing if it does
    */
  @JSImport("object-path", "ensureExists")
  @js.native
  def ensureExists_TResult_TResult[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
  
  /**
    * Get a path from an object
    */
  @JSImport("object-path", "get")
  @js.native
  def get(`object`: js.Object, path: Path): js.Any = js.native
  @JSImport("object-path", "get")
  @js.native
  def get[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
  
  /**
    * Tests path existence
    */
  @JSImport("object-path", "has")
  @js.native
  def has(`object`: js.Object, path: Path): Boolean = js.native
  
  /**
    * Insert an item in an array path
    */
  @JSImport("object-path", "insert")
  @js.native
  def insert(`object`: js.Object, path: Path, value: js.Any): Unit = js.native
  @JSImport("object-path", "insert")
  @js.native
  def insert(`object`: js.Object, path: Path, value: js.Any, at: Double): Unit = js.native
  
  /**
    * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
    */
  @JSImport("object-path", "push")
  @js.native
  def push(`object`: js.Object, path: Path, items: js.Any*): Unit = js.native
  
  /**
    * Set a path to a value
    * @return Any existing value on the path if any
    */
  @JSImport("object-path", "set")
  @js.native
  def set[TResult](`object`: js.Object, path: Path, value: TResult): js.UndefOr[TResult] = js.native
  @JSImport("object-path", "set")
  @js.native
  def set[TResult](`object`: js.Object, path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
  
  @JSImport("object-path", "withInheritedProps")
  @js.native
  def withInheritedProps: ObjectPathStatic = js.native
  /**
    * Binds an object
    */
  @JSImport("object-path", "withInheritedProps")
  @js.native
  def withInheritedProps[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
  @scala.inline
  def withInheritedProps_=(x: ObjectPathStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withInheritedProps")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ObjectPathBound[T /* <: js.Object */] extends StObject {
    
    def coalesce[TResult](paths: js.Array[Path]): js.UndefOr[TResult] = js.native
    def coalesce[TResult](paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
    def coalesce[TResult](paths: Path): js.UndefOr[TResult] = js.native
    def coalesce[TResult](paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    @JSName("coalesce")
    def coalesce_TResult_TResult[TResult](paths: js.Array[Path], defaultValue: TResult): TResult = js.native
    /**
      * @see objectPath.coalesce
      */
    @JSName("coalesce")
    def coalesce_TResult_TResult[TResult](paths: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * @see objectPath.del
      */
    def del(path: Path): StringDictionary[js.Any] = js.native
    
    /**
      * @see objectPath.empty
      */
    def empty(path: Path): js.Any = js.native
    
    def ensureExists[TResult](path: Path): js.UndefOr[TResult] = js.native
    def ensureExists[TResult](path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    /**
      * @see objectPath.ensureExists
      */
    @JSName("ensureExists")
    def ensureExists_TResult_TResult[TResult](path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * @see objectPath.get
      */
    def get(path: Path): js.Any = js.native
    def get[TResult](path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * @see objectPath.has
      */
    def has(path: Path): Boolean = js.native
    
    /**
      * @see objectPath.insert
      */
    def insert(path: Path, value: js.Any): Unit = js.native
    def insert(path: Path, value: js.Any, at: Double): Unit = js.native
    
    /**
      * @see objectPath.push
      */
    def push(path: Path, items: js.Any*): Unit = js.native
    
    /**
      * @see objectPath.set
      */
    def set[TResult](path: Path, value: TResult): js.UndefOr[TResult] = js.native
    def set[TResult](path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
  }
  
  @js.native
  trait ObjectPathStatic extends StObject {
    
    /**
      * Binds an object
      */
    def apply[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
    
    def coalesce[TResult](`object`: js.Object, paths: js.Array[Path]): js.UndefOr[TResult] = js.native
    def coalesce[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
    def coalesce[TResult](`object`: js.Object, paths: Path): js.UndefOr[TResult] = js.native
    def coalesce[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    @JSName("coalesce")
    def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): TResult = js.native
    /**
      * Get the first non undefined property
      */
    @JSName("coalesce")
    def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * Deletes a member from object or array
      */
    def del(`object`: js.Object, path: Path): StringDictionary[js.Any] = js.native
    
    /**
      * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
      * are set to empty, numbers to 0, everything else is set to null
      */
    def empty(`object`: js.Object, path: Path): js.Any = js.native
    
    def ensureExists[TResult](`object`: js.Object, path: Path): js.UndefOr[TResult] = js.native
    def ensureExists[TResult](`object`: js.Object, path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    /**
      * Set a value if it doesn't exist, do nothing if it does
      */
    @JSName("ensureExists")
    def ensureExists_TResult_TResult[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * Get a path from an object
      */
    def get(`object`: js.Object, path: Path): js.Any = js.native
    def get[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * Tests path existence
      */
    def has(`object`: js.Object, path: Path): Boolean = js.native
    
    /**
      * Insert an item in an array path
      */
    def insert(`object`: js.Object, path: Path, value: js.Any): Unit = js.native
    def insert(`object`: js.Object, path: Path, value: js.Any, at: Double): Unit = js.native
    
    /**
      * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
      */
    def push(`object`: js.Object, path: Path, items: js.Any*): Unit = js.native
    
    /**
      * Set a path to a value
      * @return Any existing value on the path if any
      */
    def set[TResult](`object`: js.Object, path: Path, value: TResult): js.UndefOr[TResult] = js.native
    def set[TResult](`object`: js.Object, path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var includeInheritedProps: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeInheritedProps(value: Boolean): Self = StObject.set(x, "includeInheritedProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInheritedPropsUndefined: Self = StObject.set(x, "includeInheritedProps", js.undefined)
    }
  }
  
  type Path = (js.Array[Double | String]) | Double | String
}
