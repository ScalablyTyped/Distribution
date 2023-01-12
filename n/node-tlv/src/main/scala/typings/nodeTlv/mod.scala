package typings.nodeTlv

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.nodeTlv.anon.Clazz
import typings.nodeTlv.nodeTlvInts.`0`
import typings.nodeTlv.nodeTlvInts.`1`
import typings.nodeTlv.nodeTlvStrings.ascii
import typings.nodeTlv.nodeTlvStrings.buffer
import typings.nodeTlv.nodeTlvStrings.hex
import typings.nodeTlv.nodeTlvStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* static member */
  inline def apply(tag: String, value: String): String = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(tag: String, value: String, encoding: Double): String = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(tag: Double, value: String): String = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(tag: Double, value: String, encoding: Double): String = (^.asInstanceOf[js.Dynamic].apply(tag.asInstanceOf[js.Any], value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("node-tlv", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TLV {
    // @param value Source code docs say "string" only but can support a "Buffer" as well
    // Source code has tests to use a buffer as a value
    def this(tag: String, value: String) = this()
    def this(tag: String, value: Buffer) = this()
    def this(tag: Double, value: String) = this()
    def this(tag: Double, value: Buffer) = this()
    def this(tag: String, value: String, encoding: Double) = this()
    def this(tag: String, value: Buffer, encoding: Double) = this()
    def this(tag: Double, value: String, encoding: Double) = this()
    def this(tag: Double, value: Buffer, encoding: Double) = this()
  }
  @JSImport("node-tlv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("node-tlv", "DGI")
  @js.native
  def DGI: `1` = js.native
  inline def DGI_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DGI")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DOL
    extends StObject
       with Instantiable1[
          (/* dolData */ Buffer) | (/* dolData */ Double) | (/* dolData */ String), 
          DOLConstructed
        ] {
    
    def parse(dolData: String): DOLConstructed = js.native
  }
  // FIXME:  Not sure how to make a property of a class as static class and not the instantiated object
  // Have split the class into two interfaces
  /* static member */
  @JSImport("node-tlv", "DOL")
  @js.native
  def DOL: DOL = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node-tlv", "DOL")
  @js.native
  open class DOLCls protected ()
    extends StObject
       with DOLConstructed {
    def this(dolData: String) = this()
    def this(dolData: Double) = this()
    def this(dolData: Buffer) = this()
    
    /* CompleteClass */
    override def count(): Double = js.native
    
    /* CompleteClass */
    override def find(args: Any*): TL = js.native
    
    /* CompleteClass */
    override def getDolRelatedDataLength(): Double = js.native
    
    /* CompleteClass */
    override def getList(): js.Array[TL] = js.native
    
    /* CompleteClass */
    var list: js.Array[TL] = js.native
    
    /* CompleteClass */
    override def print(): Unit = js.native
    
    /* CompleteClass */
    override def setValue(args: Any*): js.Array[TLV] = js.native
  }
  
  inline def DOL_=(x: DOL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("node-tlv", "EMV")
  @js.native
  def EMV: `0` = js.native
  inline def EMV_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMV")(x.asInstanceOf[js.Any])
  
  /**
    * Return value of the length field as a hex string.
    */
  /* static member */
  inline def L(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("L")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def L(value: String, flag: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("L")(value.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def L(value: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("L")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def L(value: Buffer, flag: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("L")(value.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return value of the length field and the value field as hex string
    */
  /* static member */
  inline def LV(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("LV")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def LV(value: String, flag: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("LV")(value.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def LV(value: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("LV")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def LV(value: Buffer, flag: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("LV")(value.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return value of the length field as a hex string
    */
  /* static member */
  @JSImport("node-tlv", "T")
  @js.native
  def T: js.Function1[/* tag */ String | Buffer | Double, String] = js.native
  
  @js.native
  trait TL extends StObject {
    
    var bLength: Buffer = js.native
    
    var bTag: Buffer = js.native
    
    /**
      * @param flag When true measures the length of the value, when false measures the length of the buffer value
      */
    def getL(): String = js.native
    def getL(flag: Boolean): String = js.native
    
    def getLength(): Double = js.native
    
    def getName(): String = js.native
    
    def getSize(): Double = js.native
    
    def getTL(): String = js.native
    
    /**
      * Return the value of the tag field of the TL.
      */
    def getTag(): String = js.native
    def getTag(tag: String): String = js.native
    def getTag(tag: Double): Double = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    def print(): Unit = js.native
    def print(indent: Double): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    
    var size: Double = js.native
    
    var tag: String = js.native
    
    def toTLV(str: String): TLV = js.native
  }
  /* static member */
  @JSImport("node-tlv", "TL")
  @js.native
  def TL: TL = js.native
  
  @js.native
  trait TLV extends StObject {
    
    var bLength: Buffer = js.native
    
    var bTag: Buffer = js.native
    
    var bValue: Buffer = js.native
    
    var child: js.Array[TLV] = js.native
    
    /**
      * Command used with ALV tags
      */
    var desc: js.UndefOr[js.Function1[/* tlv */ this.type, js.Array[String]]] = js.native
    
    var encodingMode: `0` | `1` = js.native
    
    /**
      * Find tlv object.
      */
    def find(tag: String): TLV = js.native
    def find(tag: Double): TLV = js.native
    
    /**
      * Find tlv object.
      */
    def findAll(tag: String): js.Array[TLV] = js.native
    def findAll(tag: Double): js.Array[TLV] = js.native
    
    /**
      * Get child TLV objects.
      */
    def getChild(): js.Array[TLV] = js.native
    
    /**
      * Command used with ALV tags
      */
    var getCommand: js.UndefOr[js.Function0[js.Array[String]]] = js.native
    
    /**
      * Return the value of the encoding of the TLV.
      */
    def getEncoding(): Double = js.native
    
    /**
      * Return the value of the length field as a hex string
      *
      * @param flag When true measures the length of the value, when false measures the length of the buffer value
      */
    def getL(): String = js.native
    def getL(flag: Boolean): String = js.native
    
    /**
      * Return the value of the length, value field as a hex string
      *
      * @param flag When true measures the length of the value, when false measures the length of the buffer value
      */
    def getLV(): String = js.native
    def getLV(flag: Boolean): String = js.native
    
    /**
      * Return the value of the length field of the TLV.
      *
      * @param encoding return type ('number' / 'hex' / 'buffer'). 'number' is default
      */
    def getLength(): Double = js.native
    @JSName("getLength")
    def getLength_buffer(encoding: buffer): Buffer = js.native
    @JSName("getLength")
    def getLength_hex(encoding: hex): String = js.native
    @JSName("getLength")
    def getLength_number(encoding: number): Double = js.native
    
    /**
      * Return the name of the TLV.
      */
    def getName(): String = js.native
    
    /**
      * Return the length of the TLV (tag + length + value)
      */
    def getSize(): Double = js.native
    
    /**
      * Return the value of the tag, length fields as a hex string
      */
    def getTL(): String = js.native
    
    /**
      * Return the value of the tag, length, value field as a hex string
      */
    def getTLV(): String = js.native
    
    /**
      * Return the value of the tag, length fields as a hex string
      */
    def getTV(): String = js.native
    
    /**
      * Return the value of the tag field of the TLV.
      *
      * @param encoding return type ('number' / 'hex' / 'buffer'). 'hex' is default
      */
    def getTag(): String = js.native
    @JSName("getTag")
    def getTag_buffer(encoding: buffer): Buffer = js.native
    @JSName("getTag")
    def getTag_hex(encoding: hex): String = js.native
    @JSName("getTag")
    def getTag_number(encoding: number): Double = js.native
    
    /**
      * Get Child TLV objects.
      */
    def getTlvByTag(tag: String): js.Array[TLV] = js.native
    def getTlvByTag(tag: Double): js.Array[TLV] = js.native
    
    /**
      * Return the value of the value field of the TLV.
      */
    def getValue(): String = js.native
    def getValue(encoding: hex | ascii): String = js.native
    @JSName("getValue")
    def getValue_buffer(encoding: buffer): Buffer = js.native
    
    var info: Clazz = js.native
    
    var isConstructed: Boolean = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    /**
      * @returns DOL
      */
    def parseDolValue(): DOL = js.native
    
    /**
      * Print the TLV structure.
      *
      * @param indent tab space. Defaults to 0
      */
    def print(): Unit = js.native
    def print(indent: Double): Unit = js.native
    
    /**
      * Print the TLV structure.
      * @deprecated Use print
      * @param indent tab space. Defaults to 0
      */
    def print2(): Unit = js.native
    def print2(indent: Double): Unit = js.native
    
    /**
      * Size:  tag length , length length, value length
      * Combined length of tag, length and value field
      */
    var size: Double = js.native
    
    var tag: String = js.native
    
    var value: String = js.native
  }
  object TLV {
    
    /* static member */
    @JSImport("node-tlv", "TLV")
    @js.native
    def apply(tag: String, value: String): String = js.native
    @JSImport("node-tlv", "TLV")
    @js.native
    def apply(tag: String, value: String, encoding: Double): String = js.native
    @JSImport("node-tlv", "TLV")
    @js.native
    def apply(tag: Double, value: String): String = js.native
    @JSImport("node-tlv", "TLV")
    @js.native
    def apply(tag: Double, value: String, encoding: Double): String = js.native
  }
  
  inline def TL_=(x: TL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TL")(x.asInstanceOf[js.Any])
  
  inline def T_=(x: js.Function1[/* tag */ String | Buffer | Double, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("T")(x.asInstanceOf[js.Any])
  
  /**
    * Return value of the value field as string
    */
  /* static member */
  inline def V(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("V")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def adjustLength(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustLength")().asInstanceOf[Double]
  inline def adjustLength(length: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustLength")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def adjustLength(length: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustLength")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def adjustTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")().asInstanceOf[String]
  inline def adjustTag(tag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def adjustTag(tag: String, encoding: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def adjustTag(tag: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def adjustTag(tag: Double, encoding: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def adjustTag(tag: Unit, encoding: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def adjustTag(tag: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def adjustTag(tag: Buffer, encoding: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustTag")(tag.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def adjustValue(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustValue")().asInstanceOf[String]
  inline def adjustValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def adjustValue(value: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def getBufferLength(len: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getBufferLength")(len.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def getBufferLength(len: Double, encoding: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("getBufferLength")(len.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /* static member */
  inline def getBufferTag(buf: Buffer, encoding: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("getBufferTag")(buf.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def getName(tag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Return the name of the TLV.
    */
  /* static member */
  inline def getName(tag: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def log(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[Unit]
  
  /**
    * Parse
    * @param data TAG, LENGTH, VALUE hex string
    */
  /* static member */
  @JSImport("node-tlv", "parse")
  @js.native
  def parse: js.Function2[/* data */ js.UndefOr[String | Buffer], /* encoding */ js.UndefOr[Double], TLV] = js.native
  
  /**
    * Get TLV objects.
    */
  /* static member */
  inline def parseList(data: String): js.Array[TLV] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TLV]]
  inline def parseList(data: String, encoding: Double): js.Array[TLV] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Array[TLV]]
  inline def parseList(data: Buffer): js.Array[TLV] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TLV]]
  inline def parseList(data: Buffer, encoding: Double): js.Array[TLV] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.Array[TLV]]
  
  inline def parse_=(x: js.Function2[/* data */ js.UndefOr[String | Buffer], /* encoding */ js.UndefOr[Double], TLV]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
  
  trait DOLConstructed extends StObject {
    
    def count(): Double
    
    def find(args: Any*): TL
    
    def getDolRelatedDataLength(): Double
    
    def getList(): js.Array[TL]
    
    var list: js.Array[TL]
    
    def print(): Unit
    
    def setValue(args: Any*): js.Array[TLV]
  }
  object DOLConstructed {
    
    inline def apply(
      count: () => Double,
      find: /* repeated */ Any => TL,
      getDolRelatedDataLength: () => Double,
      getList: () => js.Array[TL],
      list: js.Array[TL],
      print: () => Unit,
      setValue: /* repeated */ Any => js.Array[TLV]
    ): DOLConstructed = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), find = js.Any.fromFunction1(find), getDolRelatedDataLength = js.Any.fromFunction0(getDolRelatedDataLength), getList = js.Any.fromFunction0(getList), list = list.asInstanceOf[js.Any], print = js.Any.fromFunction0(print), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[DOLConstructed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DOLConstructed] (val x: Self) extends AnyVal {
      
      inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setFind(value: /* repeated */ Any => TL): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setGetDolRelatedDataLength(value: () => Double): Self = StObject.set(x, "getDolRelatedDataLength", js.Any.fromFunction0(value))
      
      inline def setGetList(value: () => js.Array[TL]): Self = StObject.set(x, "getList", js.Any.fromFunction0(value))
      
      inline def setList(value: js.Array[TL]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: TL*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setPrint(value: () => Unit): Self = StObject.set(x, "print", js.Any.fromFunction0(value))
      
      inline def setSetValue(value: /* repeated */ Any => js.Array[TLV]): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
}
