package typings.mongoose.mod

import typings.mongodb.mod.Binary
import typings.mongodb.mod.ObjectID_
import typings.mongoose.anon.FlattenMaps
import typings.mongoose.anon.Noop
import typings.mongoose.anon.TypeofObjectID_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "Types")
@js.native
object Types extends js.Object {
  
  /*
    * section types/array.js
    * http://mongoosejs.com/docs/api.html#types-array-js
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Array<T> * / any */ @js.native
  trait Array[T] extends js.Object {
    
    /**
      * Pops the array atomically at most one time per document save().
      * Calling this mulitple times on an array before saving sends the same command as
      * calling it once. This update is implemented using the MongoDB $pop method which
      * enforces this restriction.
      */
    @JSName("$pop")
    def $pop(): T = js.native
    
    /**
      * Atomically shifts the array at most one time per document save().
      * Calling this mulitple times on an array before saving sends the same command as
      * calling it once. This update is implemented using the MongoDB $pop method which
      * enforces this restriction.
      */
    @JSName("$shift")
    def $shift(): T = js.native
    
    /**
      * Adds values to the array if not already present.
      * @returns the values that were added
      */
    def addToSet(args: js.Any*): Array[T] = js.native
    
    /**
      * Return the index of obj or -1 if not found.
      * @param obj the item to look for
      */
    def indexOf(obj: js.Any): Double = js.native
    
    /** Helper for console.log */
    def inspect(): js.Any = js.native
    
    /**
      * Marks the entire array as modified, which if saved, will store it as a $set
      * operation, potentially overwritting any changes that happen between when you
      * retrieved the object and when you save it.
      * @returns new length of the array
      */
    def nonAtomicPush(args: js.Any*): Double = js.native
    
    /**
      * Wraps Array#pop with proper change tracking.
      * marks the entire array as modified which will pass the entire thing to $set
      * potentially overwritting any changes that happen between when you retrieved
      * the object and when you save it.
      */
    def pop(): T = js.native
    
    /**
      * Pulls items from the array atomically. Equality is determined by casting
      * the provided value to an embedded document and comparing using
      * the Document.equals() function.
      */
    def pull(args: js.Any*): this.type = js.native
    
    /**
      * Wraps Array#push with proper change tracking.
      * @returns new length of the array
      */
    def push(args: js.Any*): Double = js.native
    
    /** Alias of pull */
    def remove(args: js.Any*): this.type = js.native
    
    /** Sets the casted val at index i and marks the array modified. */
    def set(i: Double, `val`: js.Any): this.type = js.native
    
    /**
      * Wraps Array#shift with proper change tracking.
      * Marks the entire array as modified, which if saved, will store it as a $set operation,
      * potentially overwritting any changes that happen between when you retrieved the object
      * and when you save it.
      */
    def shift(): T = js.native
    
    /**
      * Wraps Array#sort with proper change tracking.
      * Marks the entire array as modified, which if saved, will store it as a $set operation,
      * potentially overwritting any changes that happen between when you retrieved the object
      * and when you save it.
      */
    // some lib.d.ts have return type "this" and others have return type "T[]"
    // which causes errors. Let the inherited array provide the sort() method.
    //sort(compareFn?: (a: T, b: T) => number): T[];
    /**
      * Wraps Array#splice with proper change tracking and casting.
      * Marks the entire array as modified, which if saved, will store it as a $set operation,
      * potentially overwritting any changes that happen between when you retrieved the object
      * and when you save it.
      */
    def splice(args: js.Any*): Array[T] = js.native
    
    /** Returns a native js Array. */
    def toObject(): Array[T] = js.native
    def toObject(options: js.Any): Array[T] = js.native
    
    /**
      * Wraps Array#unshift with proper change tracking.
      * Marks the entire array as modified, which if saved, will store it as a $set operation,
      * potentially overwritting any changes that happen between when you retrieved the object
      * and when you save it.
      */
    def unshift(args: js.Any*): Double = js.native
  }
  
  /*
    * section types/buffer.js
    * http://mongoosejs.com/docs/api.html#types-buffer-js
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Buffer * / any */ @js.native
  trait Buffer extends js.Object {
    
    /**
      * Copies the buffer.
      * Buffer#copy does not mark target as modified so you must copy
      * from a MongooseBuffer for it to work as expected. This is a
      * work around since copy modifies the target, not this.
      */
    def copy(target: NativeBuffer, nodeBufferArgs: js.Any*): Double = js.native
    
    /** Determines if this buffer is equals to other buffer */
    def equals(other: NativeBuffer): Boolean = js.native
    
    /** Sets the subtype option and marks the buffer modified. */
    def subtype(subtype: Double): Unit = js.native
    
    /** Converts this buffer to its Binary type representation. */
    def toObject(): Binary = js.native
    def toObject(subtype: Double): Binary = js.native
    
    /** Writes the buffer. */
    def write(string: String, nodeBufferArgs: js.Any*): Double = js.native
  }
  
  /*
    * section types/documentarray.js
    * http://mongoosejs.com/docs/api.html#types-documentarray-js
    */
  @js.native
  trait DocumentArray[T /* <: MongooseDocument */] extends Array[T] {
    
    /**
      * Creates a subdocument casted to this schema.
      * This is the same subdocument constructor used for casting.
      * @param obj the value to cast to this arrays SubDocument schema
      */
    def create(obj: js.Any): T = js.native
    
    def id(id: String): T = js.native
    def id(id: Double): T = js.native
    def id(id: NativeBuffer): T = js.native
    /**
      * Searches array items for the first document with a matching _id.
      * @returns the subdocument or null if not found.
      */
    def id(id: ObjectId): T = js.native
  }
  
  /*
    * section types/embedded.js
    * http://mongoosejs.com/docs/api.html#types-embedded-js
    */
  @js.native
  trait Embedded extends MongooseDocument {
    
    /** Returns the top level document of this sub-document. */
    def ownerDocument(): MongooseDocument = js.native
    
    /** Returns this sub-documents parent document. */
    def parent(): MongooseDocument = js.native
    
    /** Returns this sub-documents parent array. */
    def parentArray(): DocumentArray[MongooseDocument] = js.native
    
    /** Removes the subdocument from its parent array. */
    def remove(): this.type = js.native
    def remove(options: js.UndefOr[scala.Nothing], fn: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    def remove(options: Noop): this.type = js.native
    def remove(options: Noop, fn: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  }
  
  /**
    * section types/map.js
    * https://mongoosejs.com/docs/schematypes.html#maps
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Map<string, V> * / any */ @js.native
  trait Map[V] extends js.Object {
    
    /** Returns a native js Map. */
    def toObject(): GlobalMap[String, V] = js.native
    /** Returns this Map object as a POJO. */
    def toObject(options: FlattenMaps with js.Object): Record[String, V] = js.native
    def toObject(options: js.Any): GlobalMap[String, V] = js.native
  }
  
  /*
    * section types/subdocument.js
    * http://mongoosejs.com/docs/api.html#types-subdocument-js
    */
  @js.native
  trait Subdocument extends MongooseDocument {
    
    /** Returns the top level document of this sub-document. */
    def ownerDocument(): MongooseDocument = js.native
    
    /**
      * Null-out this subdoc
      * @param callback optional callback for compatibility with Document.prototype.remove
      */
    def remove(): Unit = js.native
    def remove(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
    def remove(options: js.Any): Unit = js.native
    def remove(options: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  }
  
  type Decimal128 = typings.mongodb.mod.Decimal128
  
  // var objectId: mongoose.Types.ObjectId should reference mongodb.ObjectID not
  //   the ObjectIdConstructor, so we add the interface below
  type ObjectId = ObjectID_
  
  // mongodb.ObjectID does not allow mongoose.Types.ObjectId(id). This is
  //   commonly used in mongoose and is found in an example in the docs:
  //   http://mongoosejs.com/docs/api.html#aggregate_Aggregate
  // constructor exposes static methods of mongodb.ObjectID and ObjectId(id)
  type ObjectIdConstructor = TypeofObjectID_ with (js.Function1[/* s */ js.UndefOr[String | Double], ObjectID_])
}
