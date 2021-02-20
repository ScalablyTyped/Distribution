package typings.parseGitignore

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse a .gitignore or .npmignore file into an array of patterns.
    */
  @JSImport("parse-gitignore", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Array[String] = js.native
  @JSImport("parse-gitignore", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): js.Array[String] = js.native
  
  @JSImport("parse-gitignore", "format")
  @js.native
  def format(section: Section): String = js.native
  
  /**
    * Pass the contents of a .gitignore file as a string or buffer
    */
  @JSImport("parse-gitignore", "parse")
  @js.native
  def parse(input: String): State = js.native
  @JSImport("parse-gitignore", "parse")
  @js.native
  def parse(input: String, fn: FormatLine): State = js.native
  @JSImport("parse-gitignore", "parse")
  @js.native
  def parse(input: Buffer): State = js.native
  @JSImport("parse-gitignore", "parse")
  @js.native
  def parse(input: Buffer, fn: FormatLine): State = js.native
  
  @JSImport("parse-gitignore", "stringify")
  @js.native
  def stringify(sections: js.Array[Section]): String = js.native
  @JSImport("parse-gitignore", "stringify")
  @js.native
  def stringify(sections: js.Array[Section], fn: js.Function1[/* section */ Section, String]): String = js.native
  
  type FormatLine = js.Function3[
    /* line */ String, 
    /* section */ js.UndefOr[Section], 
    /* state */ js.UndefOr[State], 
    String
  ]
  
  @js.native
  trait Section extends StObject {
    
    val name: String = js.native
    
    val patterns: js.Array[String] = js.native
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
  
  @js.native
  trait State extends StObject {
    
    var patterns: js.Array[String] = js.native
    
    var sections: js.Array[Section] = js.native
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
