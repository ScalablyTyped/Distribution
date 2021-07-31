package typings.parseGitignore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse a .gitignore or .npmignore file into an array of patterns.
    */
  @scala.inline
  def apply(input: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(input: Buffer): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @JSImport("parse-gitignore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def format(section: Section): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(section.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Pass the contents of a .gitignore file as a string or buffer
    */
  @scala.inline
  def parse(input: String): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[State]
  @scala.inline
  def parse(input: String, fn: FormatLine): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[State]
  @scala.inline
  def parse(input: Buffer): State = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[State]
  @scala.inline
  def parse(input: Buffer, fn: FormatLine): State = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[State]
  
  @scala.inline
  def stringify(sections: js.Array[Section]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(sections.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(sections: js.Array[Section], fn: js.Function1[/* section */ Section, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(sections.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type FormatLine = js.Function3[
    /* line */ String, 
    /* section */ js.UndefOr[Section], 
    /* state */ js.UndefOr[State], 
    String
  ]
  
  trait Section extends StObject {
    
    val name: String
    
    val patterns: js.Array[String]
  }
  object Section {
    
    @scala.inline
    def apply(name: String, patterns: js.Array[String]): Section = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Section]
    }
    
    @scala.inline
    implicit class SectionMutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  trait State extends StObject {
    
    var patterns: js.Array[String]
    
    var sections: js.Array[Section]
  }
  object State {
    
    @scala.inline
    def apply(patterns: js.Array[String], sections: js.Array[Section]): State = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
      
      @scala.inline
      def setSections(value: js.Array[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value :_*))
    }
  }
}
